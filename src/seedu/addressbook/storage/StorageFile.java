package seedu.addressbook.storage;

import java.nio.file.Path;

import seedu.addressbook.data.AddressBook;


/**
 * Represents the file used to store address book data.
 */
public class StorageFile extends Storage{

    /** Default file path used if the user doesn't provide the file name. */
    public static final String DEFAULT_STORAGE_FILEPATH = "addressbook.txt";

    /* Note: Note the use of nested classes below.
     * More info https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
     */



    /**
     * @throws InvalidStorageFileException
     * @throws InvalidStorageFilePathException if the default path is invalid
     */
    public StorageFile() throws InvalidStorageFileException {
    		super();
    }

    /**
     * @throws InvalidStorageFilePathException if the given file path is invalid
     */
	public StorageFile(String filePath) throws InvalidStorageFileException {
		super(filePath);
	}

    /**
     * Returns true if the given path is acceptable as a storage file.
     * The file path is considered acceptable if it ends with '.txt'
     */
    private static boolean isValidPath(Path filePath) {
        return filePath.toString().endsWith(".txt");
    }

    /**
     * Saves all data to this storage file.
     * @throws seedu.addressbook.storage.Storage.StorageOperationException
     */
    public void save(AddressBook addressBook) throws StorageOperationException{
    	super.save(addressBook);
    }

    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */
    public AddressBook load() throws StorageOperationException {
        return super.load();
    }

    public String getPath() {
        return super.getPath();
    }

}
