import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.util.MockCreationValidator;
import org.mockito.internal.util.MockName;
import org.mockito.internal.util.MockUtil;

import java.io.Serializable;
import java.util.ArrayList;

public class MockUtilTest {

    private MockUtil mockUtil;

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    private MockSettingsImpl createDefaultSettings() {
        return (MockSettingsImpl) Mockito.withSettings().defaultAnswer(Mockito.RETURNS_DEFAULTS);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultConstructor_createsInstance() {
        MockUtil util = new MockUtil();
        assertNotNull(util);
    }

    @Test
    public void testConstructor_withCustomValidator_createsInstance() {
        MockCreationValidator validator = new MockCreationValidator();
        MockUtil util = new MockUtil(validator);
        assertNotNull(util);
    }

    // ---------- createMock tests ----------

    @Test
    public void testCreateMock_normalClass_returnsNonNullMock() {
        MockSettingsImpl settings = createDefaultSettings();
        ArrayList<?> mock = mockUtil.createMock(ArrayList.class, settings);
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testCreateMock_withExtraInterfacesAndSerializable_returnsMockImplementingThem() {
        MockSettingsImpl settings = (MockSettingsImpl) Mockito.withSettings()
                .extraInterfaces(Comparable.class)
                .serializable()
                .defaultAnswer(Mockito.RETURNS_DEFAULTS);

        ArrayList<?> mock = mockUtil.createMock(ArrayList.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof Comparable);
        assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_withoutExtraInterfacesNotSerializable_returnsPlainMock() {
        MockSettingsImpl settings = createDefaultSettings();
        ArrayList<?> mock = mockUtil.createMock(ArrayList.class, settings);

        assertNotNull(mock);
        assertFalse(mock instanceof Comparable);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateMock_finalClass_throwsException() {
        // java.lang.String is final, cannot be mocked -> validator should throw
        mockUtil.createMock(String.class, createDefaultSettings());
    }

    // ---------- getMockHandler tests ----------

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_nullMock_throwsNotAMockException() {
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_nonMockObject_throwsNotAMockException() {
        Object notAMock = new Object();
        mockUtil.getMockHandler(notAMock);
    }

    @Test
    public void testGetMockHandler_validMock_returnsHandler() {
        MockSettingsImpl settings = createDefaultSettings();
        ArrayList<?> mock = mockUtil.createMock(ArrayList.class, settings);

        MockHandlerInterface<?> handler = mockUtil.getMockHandler(mock);

        assertNotNull(handler);
    }

    // ---------- isMock tests ----------

    @Test
    public void testIsMock_nullObject_returnsFalse() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMock_nonMockObject_returnsFalse() {
        Object notAMock = new Object();
        assertFalse(mockUtil.isMock(notAMock));
    }

    @Test
    public void testIsMock_plainStringInstance_returnsFalse() {
        String plain = "hello";
        assertFalse(mockUtil.isMock(plain));
    }

    @Test
    public void testIsMock_validMock_returnsTrue() {
        MockSettingsImpl settings = createDefaultSettings();
        ArrayList<?> mock = mockUtil.createMock(ArrayList.class, settings);

        assertTrue(mockUtil.isMock(mock));
    }

    // ---------- resetMock tests ----------

    @Test
    public void testResetMock_validMock_doesNotThrowAndStaysMock() {
        MockSettingsImpl settings = createDefaultSettings();
        ArrayList<?> mock = mockUtil.createMock(ArrayList.class, settings);

        mockUtil.resetMock(mock);

        assertTrue(mockUtil.isMock(mock));
    }

    // ---------- getMockName tests ----------

    @Test
    public void testGetMockName_validMock_returnsNonNullName() {
        MockSettingsImpl settings = createDefaultSettings();
        ArrayList<?> mock = mockUtil.createMock(ArrayList.class, settings);

        MockName name = mockUtil.getMockName(mock);

        assertNotNull(name);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockName_nonMockObject_throwsNotAMockException() {
        Object notAMock = new Object();
        mockUtil.getMockName(notAMock);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockName_nullObject_throwsNotAMockException() {
        mockUtil.getMockName(null);
    }
}
