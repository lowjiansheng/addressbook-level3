package seedu.addressbook.storage;

import java.nio.file.Path;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.InvalidStorageFilePathException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public abstract class Storage {


	public abstract AddressBook load() throws StorageOperationException;
	public abstract String getPath();
	public abstract void save(AddressBook addressBook) throws StorageOperationException;



}
