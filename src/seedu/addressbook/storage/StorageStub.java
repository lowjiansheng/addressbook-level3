package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage.StorageOperationException;

public class StorageStub extends Storage {

	public StorageStub() throws InvalidStorageFileException {
		super();
	}

	/**
     * @throws InvalidStorageFilePathException if the given file path is invalid
     */
	public StorageStub(String filePath) throws InvalidStorageFileException {
		super(filePath);
	}


	/**
     * Saves all data to this storage file.
     * @throws seedu.addressbook.storage.Storage.StorageOperationException
     */
	@Override
    public void save(AddressBook addressBook) throws StorageOperationException{

    }


}
