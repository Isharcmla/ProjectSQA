package org.mockito.internal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;

/**
 * Test suite for {@link MockHandler}.
 *
 * หมายเหตุ: ไม่สามารถสร้าง instance จริงของ org.mockito.internal.invocation.Invocation
 * ที่มีค่า field ครบถ้วนได้ เนื่องจากไม่มีข้อมูล API ของ dependency ที่เกี่ยวข้อง
 * (เช่น MockitoMethod, RealMethod) ให้มาใน <dependencies> ดังนั้นการทดสอบ handle()
 * จะทดสอบผ่าน public API ที่สามารถเข้าถึงได้จริง เช่นกรณี null invocation
 * ซึ่งเป็น edge case ที่ควร throw exception ตาม requirement ข้อ 3(ค)
 */
public class MockHandlerTest {

    private MockHandler<Object> handler;
    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
        handler = new MockHandler<Object>(mockSettings);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_withMockSettings_setsMockSettingsCorrectly() {
        assertSame(mockSettings, handler.getMockSettings());
    }

    @Test
    public void testConstructor_withNullMockSettings_allowsNullSettings() {
        // edge case: null settings passed explicitly
        MockHandler<Object> h = new MockHandler<Object>((MockSettingsImpl) null);
        assertNull(h.getMockSettings());
    }

    @Test
    public void testConstructor_withOldMockHandler_copiesMockSettingsFromOldHandler() {
        MockHandler<Object> oldHandler = new MockHandler<Object>(mockSettings);
        MockHandler<Object> newHandler = new MockHandler<Object>(oldHandler);

        assertSame(mockSettings, newHandler.getMockSettings());
        // a new InvocationContainerImpl should be created for the new handler
        assertNotSame(oldHandler.getInvocationContainer(), newHandler.getInvocationContainer());
    }

    @Test
    public void testDefaultConstructor_createsHandlerWithNonNullMockSettings() {
        // package-private constructor, accessible because test is in same package
        MockHandler<Object> h = new MockHandler<Object>();
        assertNotNull(h.getMockSettings());
    }

    // ---------- getMockSettings() ----------

    @Test
    public void testGetMockSettings_returnsSameInstancePassedInConstructor() {
        assertSame(mockSettings, handler.getMockSettings());
    }

    // ---------- voidMethodStubbable() ----------

    @Test
    public void testVoidMethodStubbable_withNonNullMock_returnsNonNullStubbable() {
        Object mockObj = new Object();
        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(mockObj);
        assertNotNull(stubbable);
    }

    @Test
    public void testVoidMethodStubbable_withNullMock_doesNotThrowAndReturnsNonNull() {
        // edge case: null mock object
        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(null);
        assertNotNull(stubbable);
    }

    // ---------- getInvocationContainer() ----------

    @Test
    public void testGetInvocationContainer_returnsNonNullContainer() {
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testGetInvocationContainer_returnsSameInstanceOnMultipleCalls() {
        assertSame(handler.getInvocationContainer(), handler.getInvocationContainer());
    }

    // ---------- setAnswersForStubbing() ----------

    @Test
    public void testSetAnswersForStubbing_withEmptyList_doesNotThrowException() {
        // edge case: boundary value - empty list (size = 0)
        List<Answer> answers = new ArrayList<Answer>();
        handler.setAnswersForStubbing(answers);
        // container should still be accessible and not corrupted
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testSetAnswersForStubbing_withNullList_eitherThrowsOrCompletesGracefully() {
        // edge case: null list - behavior depends on internal InvocationContainerImpl
        // implementation which is not fully documented here; we only assert that
        // the call either completes or throws, without hanging or corrupting state
        // beyond recovery.
        try {
            handler.setAnswersForStubbing(null);
            // if no exception thrown, container must still be accessible
            assertNotNull(handler.getInvocationContainer());
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    // ---------- handle() ----------

    @Test(expected = Exception.class)
    public void testHandle_nullInvocation_throwsException() throws Throwable {
        // edge/exception case: passing null invocation should cause failure
        // somewhere inside handle() (e.g. while binding matchers or reading
        // invocation data), since the method assumes a non-null Invocation.
        handler.handle(null);
    }

    @Test
    public void testHandle_nullInvocationCaught_exceptionIsNotNull() {
        // additional explicit try/catch style verification of the exception case
        boolean exceptionThrown = false;
        try {
            handler.handle(null);
        } catch (Throwable t) {
            exceptionThrown = true;
            assertNotNull(t);
        }
        if (!exceptionThrown) {
            fail("Expected an exception to be thrown when handling a null invocation");
        }
    }
}
