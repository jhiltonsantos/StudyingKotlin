package repository

import entity.ContactEntity

class ContactRepository {

    companion object {
        private val contactList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun remove(contact: ContactEntity) {
            var indexRemove = 0
            for (item in getContactList().withIndex()) {
                if (item.value.name == contact.name && item.value.phone == contact.phone) {
                    indexRemove = item.index
                    break
                }
            }
            contactList.removeAt(indexRemove)
        }

        fun getContactList(): MutableList<ContactEntity> {
            return contactList
        }
    }

}