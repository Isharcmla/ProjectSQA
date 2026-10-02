package org.mockito.internal;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.invocation.InvocationOnMock;

/**
 * Test suite for MockHandler class.
 *
 * Note: The handle(Invocation) method requires a concrete implementation of
 * org.mockito.internal.invocation.Invocation, which is an internal class whose
 * constructor/API details were not provided in the dependencies section.
 * Per requirement #6 (ห้ามเดา API ที่ไม่ได้ให้มา), direct unit tests for handle()
 * are omitted here since we cannot safely construct a valid Invocation instance
 * without guessing its internal API.
 */
public class MockHandlerTest {

    private MockHandler<Object> mockHandler;
    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
        mockHandler = new MockHandler<Object>(mockSettings);
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_withMockSettings_shouldInitializeFieldsCorrectly() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        assertNotNull(handler);
        assertSame(settings, handler.getMockSettings());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testPackagePrivateConstructor_normalCase_shouldCreateDefaultMockSettings() {
        MockHandler<Object> handler = new MockHandler<Object>();
        assertNotNull(handler);
        assertNotNull(handler.getMockSettings());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testConstructor_withOldMockHandler_shouldCopyMockSettingsFromOldHandler() {
        MockHandler<Object> oldHandler = new MockHandler<Object>(mockSettings);
        MockHandler<Object> newHandler = new MockHandler<Object>(oldHandler);
        assertNotNull(newHandler);
        assertSame(mockSettings, newHandler.getMockSettings());
        assertNotNull(newHandler.getInvocationContainer());
    }

    @Test
    public void testConstructor_withOldMockHandlerUsingDefaultSettings_shouldPreserveSettingsReference() {
        MockHandler<Object> oldHandler = new MockHandler<Object>();
        MockSettingsImpl originalSettings = oldHandler.getMockSettings();
        MockHandler<Object> newHandler = new MockHandler<Object>(oldHandler);
        assertSame(originalSettings, newHandler.getMockSettings());
    }

    // ---------- getMockSettings() Tests ----------

    @Test
    public void testGetMockSettings_normalCase_shouldReturnSameInstancePassedInConstructor() {
        assertSame(mockSettings, mockHandler.getMockSettings());
    }

    @Test
    public void testGetMockSettings_multipleCalls_shouldReturnConsistentReference() {
        MockSettingsImpl first = mockHandler.getMockSettings();
        MockSettingsImpl second = mockHandler.getMockSettings();
        assertSame(first, second);
    }

    // ---------- getInvocationContainer() Tests ----------

    @Test
    public void testGetInvocationContainer_normalCase_shouldReturnNonNullContainer() {
        InvocationContainer container = mockHandler.getInvocationContainer();
        assertNotNull(container);
    }

    @Test
    public void testGetInvocationContainer_differentInstances_shouldHaveIndependentContainers() {
        MockHandler<Object> anotherHandler = new MockHandler<Object>(new MockSettingsImpl());
        InvocationContainer container1 = mockHandler.getInvocationContainer();
        InvocationContainer container2 = anotherHandler.getInvocationContainer();
        assertNotSame(container1, container2);
    }

    // ---------- voidMethodStubbable() Tests ----------

    @Test
    public void testVoidMethodStubbable_withValidMockObject_shouldReturnNonNullStubbable() {
        Object mockObject = new Object();
        VoidMethodStubbable<Object> stubbable = mockHandler.voidMethodStubbable(mockObject);
        assertNotNull(stubbable);
    }

    @Test
    public void testVoidMethodStubbable_withNullMock_shouldStillReturnNonNullWrapper() {
        VoidMethodStubbable<Object> stubbable = mockHandler.voidMethodStubbable(null);
        assertNotNull(stubbable);
    }

    @Test
    public void testVoidMethodStubbable_calledMultipleTimes_shouldReturnDifferentWrapperInstances() {
        Object mockObject = new Object();
        VoidMethodStubbable<Object> first = mockHandler.voidMethodStubbable(mockObject);
        VoidMethodStubbable<Object> second = mockHandler.voidMethodStubbable(mockObject);
        assertNotNull(first);
        assertNotNull(second);
        // Each call constructs a new wrapper instance
        assertNotSame(first, second);
    }

    // ---------- setAnswersForStubbing() Tests ----------

    @Test
    public void testSetAnswersForStubbing_withValidSingleAnswer_shouldNotThrowException() {
        List<Answer> answers = new ArrayList<Answer>();
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return null;
            }
        };
        answers.add(answer);

        try {
            mockHandler.setAnswersForStubbing(answers);
        } catch (Exception e) {
            fail("setAnswersForStubbing should not throw for a valid non-empty list: " + e.getMessage());
        }
        assertNotNull(mockHandler.getInvocationContainer());
    }

    @Test
    public void testSetAnswersForStubbing_withMultipleAnswers_shouldAcceptAllWithoutException() {
        List<Answer> answers = new ArrayList<Answer>();
        for (int i = 0; i < 3; i++) {
            answers.add(new Answer<Object>() {
                public Object answer(InvocationOnMock invocation) throws Throwable {
                    return "stubbed";
                }
            });
        }

        try {
            mockHandler.setAnswersForStubbing(answers);
        } catch (Exception e) {
            fail("setAnswersForStubbing should not throw for multiple valid answers: " + e.getMessage());
        }
    }

    @Test
    public void testSetAnswersForStubbing_withEmptyList_shouldNotThrowException() {
        List<Answer> answers = new ArrayList<Answer>();
        try {
            mockHandler.setAnswersForStubbing(answers);
        } catch (Exception e) {
            fail("Should not throw exception for empty list input");
        }
    }

    @Test
    public void testSetAnswersForStubbing_withNullList_shouldPropagateOrHandleGracefully() {
        // Edge case: passing null should either be handled gracefully by the underlying
        // InvocationContainerImpl or throw a predictable exception (e.g., NullPointerException).
        try {
            mockHandler.setAnswersForStubbing(null);
            // If no exception thrown, container should remain accessible
            assertNotNull(mockHandler.getInvocationContainer());
        } catch (NullPointerException expected) {
            // Acceptable behavior: underlying implementation may not accept null
            assertTrue(true);
        }
    }
}
