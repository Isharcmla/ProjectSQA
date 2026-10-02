package org.mockito.internal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.verification.InOrderContextImpl;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.InOrderContext;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;

    @Before
    public void setUp() {
        mockitoCore = new MockitoCore();
    }

    @After
    public void tearDown() {
        try {
            mockitoCore.validateMockitoUsage();
        } catch (Exception ignored) {
            new MockitoCore().reset();
        }
    }

    @Test
    public void testMock_validClassAndSettings_createsMockInstance() {
        MockSettingsImpl settings = new MockSettingsImpl();
        List<?> mockList = mockitoCore.mock(List.class, settings);
        assertNotNull(mockList);
        assertTrue(new org.mockito.internal.util.MockUtil().isMock(mockList));
    }

    @Test
    public void testWhen_validMethodCall_stubsReturnValue() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        OngoingStubbing<Object> ongoingStubbing = mockitoCore.when(mockList.get(0));
        assertNotNull(ongoingStubbing);
        ongoingStubbing.thenReturn("element");

        assertEquals("element", mockList.get(0));
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testWhen_noMethodCallBeforeWhen_throwsException() {
        mockitoCore.when("notAMethodCall");
    }

    @Test
    public void testStub_validMethodCall_returnsDeprecatedOngoingStubbing() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        DeprecatedOngoingStubbing<Object> stubbing = mockitoCore.stub(mockList.get(0));
        assertNotNull(stubbing);
        stubbing.toReturn("element");

        assertEquals("element", mockList.get(0));
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testStub_withoutMethodCall_throwsException() {
        mockitoCore.stub();
    }

    @Test
    public void testVerify_validMock_returnsSameMockInstance() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        List verifiedMock = mockitoCore.verify(mockList, VerificationModeFactory.times(1));
        assertSame(mockList, verifiedMock);
        mockList.clear(); // Complete the verification
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testVerify_nullMock_throwsException() {
        mockitoCore.verify(null, VerificationModeFactory.times(1));
    }

    @Test(expected = NotAMockException.class)
    public void testVerify_nonMockObject_throwsException() {
        mockitoCore.verify("nonMockObject", VerificationModeFactory.times(1));
    }

    @Test
    public void testReset_singleAndMultipleMocks_resetsState() {
        List mock1 = mockitoCore.mock(List.class, new MockSettingsImpl());
        List mock2 = mockitoCore.mock(List.class, new MockSettingsImpl());

        mockitoCore.when(mock1.get(0)).thenReturn("one");
        mockitoCore.when(mock2.get(0)).thenReturn("two");

        assertEquals("one", mock1.get(0));
        assertEquals("two", mock2.get(0));

        mockitoCore.reset(mock1, mock2);

        assertNull(mock1.get(0));
        assertNull(mock2.get(0));
    }

    @Test
    public void testReset_emptyMocksArray_executesSuccessfully() {
        mockitoCore.reset();
        mockitoCore.validateMockitoUsage();
    }

    @Test
    public void testVerifyNoMoreInteractions_noInvocations_succeeds() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockitoCore.verifyNoMoreInteractions(mockList);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testVerifyNoMoreInteractions_unverifiedInvocations_throwsException() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockList.add("item");
        mockitoCore.verifyNoMoreInteractions(mockList);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testVerifyNoMoreInteractions_nullPassedInArray_throwsException() {
        mockitoCore.verifyNoMoreInteractions(new Object[]{null});
    }

    @Test(expected = NotAMockException.class)
    public void testVerifyNoMoreInteractions_notAMockPassedInArray_throwsException() {
        mockitoCore.verifyNoMoreInteractions("notAMock");
    }

    @Test(expected = org.mockito.exceptions.misusing.NullInsteadOfMockException.class)
    public void testVerifyNoMoreInteractions_nullArray_throwsException() {
        mockitoCore.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(expected = org.mockito.exceptions.misusing.NullInsteadOfMockException.class)
    public void testVerifyNoMoreInteractions_emptyArray_throwsException() {
        mockitoCore.verifyNoMoreInteractions(new Object[0]);
    }

    @Test
    public void testVerifyNoMoreInteractionsInOrder_noInvocations_succeeds() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        InOrderContext context = new InOrderContextImpl();
        mockitoCore.verifyNoMoreInteractionsInOrder(Collections.singletonList((Object) mockList), context);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testVerifyNoMoreInteractionsInOrder_unverifiedInvocations_throwsException() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockList.add("item");
        InOrderContext context = new InOrderContextImpl();
        mockitoCore.verifyNoMoreInteractionsInOrder(Collections.singletonList((Object) mockList), context);
    }

    @Test
    public void testInOrder_validMocks_returnsInOrderInstance() {
        List mock1 = mockitoCore.mock(List.class, new MockSettingsImpl());
        List mock2 = mockitoCore.mock(List.class, new MockSettingsImpl());
        InOrder inOrder = mockitoCore.inOrder(mock1, mock2);
        assertNotNull(inOrder);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testInOrder_nullArray_throwsException() {
        mockitoCore.inOrder((Object[]) null);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testInOrder_emptyArray_throwsException() {
        mockitoCore.inOrder(new Object[0]);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testInOrder_nullElementInArray_throwsException() {
        List mock1 = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockitoCore.inOrder(mock1, null);
    }

    @Test(expected = NotAMockException.class)
    public void testInOrder_nonMockElementInArray_throwsException() {
        List mock1 = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockitoCore.inOrder(mock1, "nonMock");
    }

    @Test
    public void testDoAnswer_customAnswer_stubsMethodCorrectly() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        Answer<String> answer = invocation -> "answered";

        Stubber stubber = mockitoCore.doAnswer(answer);
        assertNotNull(stubber);
        stubber.when(mockList).get(0);

        assertEquals("answered", mockList.get(0));
    }

    @Test
    public void testStubVoid_validMock_returnsVoidMethodStubbable() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        VoidMethodStubbable<List> voidStubbable = mockitoCore.stubVoid(mockList);
        assertNotNull(voidStubbable);
        voidStubbable.toThrow(new RuntimeException("void stub exception")).on().clear();

        try {
            mockList.clear();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("void stub exception", e.getMessage());
        }
    }

    @Test
    public void testValidateMockitoUsage_cleanState_doesNotThrow() {
        mockitoCore.validateMockitoUsage();
    }

    @Test
    public void testGetLastInvocation_afterMethodCall_returnsLastInvocation() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockList.get(42);
        Invocation invocation = mockitoCore.getLastInvocation();
        assertNotNull(invocation);
        assertEquals("get", invocation.getMethod().getName());
        assertArrayEquals(new Object[]{42}, invocation.getArguments());
    }
}
