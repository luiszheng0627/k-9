package app.k9mail.feature.account.setup.domain.entity

import app.k9mail.autodiscovery.api.AuthenticationType
import app.k9mail.autodiscovery.api.ImapServerSettings
import app.k9mail.core.common.net.toHostname
import app.k9mail.core.common.net.toPort
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test

class IncomingServerSettingsExtensionKtTest {

    @Test
    fun `should map all ImapServerSettings to IncomingProtocolType IMAP`() {
        val imapServerSettings = ImapServerSettings(
            hostname = "example.com".toHostname(),
            port = 993.toPort(),
            connectionSecurity = AutoDiscoveryConnectionSecurity.TLS,
            authenticationType = AuthenticationType.PasswordCleartext,
            username = "username",
        )

        assertThat(imapServerSettings.toIncomingProtocolType()).isEqualTo(IncomingProtocolType.IMAP)
    }
}
