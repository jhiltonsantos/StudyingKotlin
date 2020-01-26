package manager

import entity.ContactEntity
import repository.ContactRepository

class ContactManager {

    fun save(name: String, phone: String) {
        validate(name, phone)

        val contact = ContactEntity(name, phone)
        ContactRepository.save(contact)

    }

    fun remove(name: String, phone: String) {
        validateRemove(name, phone)

        val contact = ContactEntity(name, phone)
        ContactRepository.remove(contact)

    }

    fun getList(): MutableList<ContactEntity> {
        return ContactRepository.getContactList()
    }

    private fun validate(name: String, phone: String) {
        if (name == "") {
            throw Exception("Nome é obrigatório!")
        }
        if (phone == "") {
            throw Exception("Telefone é obrigatório!")
        }
    }

    private fun validateRemove(name: String, phone: String) {
        if (name == "" || phone == "") {
            throw Exception("É necessário selecionar um contato para Remover!")
        }
    }

}