package app.k9mail.feature.account.setup.domain.entity

import kotlinx.collections.immutable.toImmutableList

internal enum class AuthenticationType {
    PasswordCleartext,
    PasswordEncrypted,
    OAuth2,
    ;

    companion object {
        val DEFAULT = PasswordCleartext
        fun all() = values().toList().toImmutableList()
    }
}
