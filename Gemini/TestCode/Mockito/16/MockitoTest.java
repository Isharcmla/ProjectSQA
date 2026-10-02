package org.mockito;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.VoidMethodStubbable;

import java.util.ArrayList;
import java.util.List;

public class MockitoTest {

    @After
    public void validate() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void testConstructor_instanceCreation_shouldSucceed() {
        Mockito mockito = new Mockito();
        Assert.assertNotNull(mockito);
    }

    @Test
    public void testMock_classOnly_createsMockInstance() {
        List<?> list = Mockito.mock(List.class);
        Assert.assertNotNull(list);
    }

    @Test
    public void testMock_withName_createsMockWithName() {
        List<?> list = Mockito.mock(List.class, "myCustomList");
        Assert.assertNotNull(list);
        Assert.assertEquals("myCustomList", list.toString());
    }

    @Test
    public void testMock_withEmptyName_createsMock() {
        List<?> list = Mockito.mock(List.class, "");
        Assert.assertNotNull(list);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testMock_withDeprecatedReturnValues_createsMock() {
        ReturnValues returnValues = new ReturnValues() {
            public Object valueFor(InvocationOnMock invocation) {
                return "customValue";
            }
        };
        List<?> list = Mockito.mock(List.class, returnValues);
        Assert.assertNotNull(list);
        Assert.assertEquals("customValue", list.get(0));
    }

    @Test
    public void testMock_withAnswer_createsMockWithAnswer() {
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                return 42;
            }
        };
        List<?> list = Mockito.mock(List.class, answer);
        Assert.assertNotNull(list);
        Assert.assertEquals(42, list.size());
    }

    @Test
    public void testMock_withMockSettings_createsMock() {
        MockSettings settings = Mockito.withSettings().name("settingsMock").defaultAnswer(Mockito.RETURNS_SMART_NULLS);
        List<?> list = Mockito.mock(List.class, settings);
        Assert.assertNotNull(list);
    }

    @Test
    public void testSpy_realObject_callsRealMethods() {
        List<String> realList = new ArrayList<String>();
        List<String> spyList = Mockito.spy(realList);
        Assert.assertNotNull(spyList);

        spyList.add("item");
        Assert.assertEquals(1, spyList.size());
        Assert.assertEquals("item", spyList.get(0));
        Mockito.verify(spyList).add("item");
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testStub_deprecatedStubbing_stubsMethod() {
        List<String> mockList = Mockito.mock(List.class);
        DeprecatedOngoingStubbing<String> stubbing = Mockito.stub(mockList.get(0));
        Assert.assertNotNull(stubbing);
        stubbing.toReturn("first");

        Assert.assertEquals("first", mockList.get(0));
    }

    @Test
    public void testWhen_standardStubbing_stubsMethod() {
        List<String> mockList = Mockito.mock(List.class);
        OngoingStubbing<String> stubbing = Mockito.when(mockList.get(0));
        Assert.assertNotNull(stubbing);
        stubbing.thenReturn("value");

        Assert.assertEquals("value", mockList.get(0));
    }

    @Test
    public void testVerify_singleMock_verifiesInteraction() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("test");
        List<String> verified = Mockito.verify(mockList);
        Assert.assertNotNull(verified);
        verified.add("test");
    }

    @Test
    public void testVerify_withVerificationModeTimes_verifiesTimes() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("test");
        mockList.add("test");

        Mockito.verify(mockList, Mockito.times(2)).add("test");
    }

    @Test
    public void testVerify_withVerificationModeNever_verifiesNever() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.verify(mockList, Mockito.never()).clear();
    }

    @Test
    public void testVerify_withVerificationModeAtLeastOnce_verifiesAtLeastOnce() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("item");
        Mockito.verify(mockList, Mockito.atLeastOnce()).add("item");
    }

    @Test
    public void testVerify_withVerificationModeAtLeast_verifiesAtLeastX() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("item");
        mockList.add("item");
        Mockito.verify(mockList, Mockito.atLeast(1)).add("item");
        Mockito.verify(mockList, Mockito.atLeast(2)).add("item");
    }

    @Test
    public void testVerify_withVerificationModeAtMost_verifiesAtMostX() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("item");
        Mockito.verify(mockList, Mockito.atMost(1)).add("item");
        Mockito.verify(mockList, Mockito.atMost(5)).add("item");
    }

    @Test
    public void testVerify_withVerificationModeOnly_verifiesOnlyThisInvocation() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("single");
        Mockito.verify(mockList, Mockito.only()).add("single");
    }

    @Test
    public void testReset_singleMock_clearsStubbingAndInteractions() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("stubbed");
        mockList.add("one");

        Mockito.reset(mockList);

        Assert.assertNull(mockList.get(0));
        Mockito.verifyZeroInteractions(mockList);
    }

    @Test
    public void testReset_multipleMocks_clearsAllMocks() {
        List<?> mock1 = Mockito.mock(List.class);
        List<?> mock2 = Mockito.mock(List.class);

        Mockito.reset(mock1, mock2);
        Mockito.verifyZeroInteractions(mock1, mock2);
    }

    @Test
    public void testReset_emptyArray_doesNotThrow() {
        Mockito.reset(new Object[0]);
    }

    @Test
    public void testVerifyNoMoreInteractions_noRedundantCalls_succeeds() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("one");
        Mockito.verify(mockList).add("one");
        Mockito.verifyNoMoreInteractions(mockList);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testVerifyNoMoreInteractions_unverifiedCall_throwsException() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("unverified");
        Mockito.verifyNoMoreInteractions(mockList);
    }

    @Test
    public void testVerifyZeroInteractions_noInteractions_succeeds() {
        List<?> mock1 = Mockito.mock(List.class);
        List<?> mock2 = Mockito.mock(List.class);
        Mockito.verifyZeroInteractions(mock1, mock2);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testVerifyZeroInteractions_withInteraction_throwsException() {
        List<String> mock1 = Mockito.mock(List.class);
        mock1.size();
        Mockito.verifyZeroInteractions(mock1);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testStubVoid_deprecatedStubVoid_stubsVoidMethod() {
        List<String> mockList = Mockito.mock(List.class);
        VoidMethodStubbable<List<String>> stubbable = Mockito.stubVoid(mockList);
        Assert.assertNotNull(stubbable);
        stubbable.toThrow(new IllegalStateException("error")).on().clear();

        try {
            mockList.clear();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("error", e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoThrow_withThrowable_throwsWhenCalled() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.doThrow(new IllegalArgumentException("invalid")).when(mockList).clear();
        mockList.clear();
    }

    @Test
    public void testDoCallRealMethod_callsRealImplementation() {
        ArrayList<String> realList = new ArrayList<String>();
        ArrayList<String> spy = Mockito.spy(realList);
        Mockito.doCallRealMethod().when(spy).clear();
        spy.add("one");
        spy.clear();
        Assert.assertEquals(0, spy.size());
    }

    @Test
    public void testDoAnswer_executesCustomAnswer() {
        List<String> mockList = Mockito.mock(List.class);
        final boolean[] flag = new boolean[]{false};
        Mockito.doAnswer(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                flag[0] = true;
                return null;
            }
        }).when(mockList).clear();

        mockList.clear();
        Assert.assertTrue(flag[0]);
    }

    @Test
    public void testDoNothing_makesMethodDoNothing() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.doNothing().when(mockList).clear();
        mockList.clear();
        Mockito.verify(mockList).clear();
    }

    @Test
    public void testDoReturn_returnsStubbedValue() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.doReturn("hello").when(mockList).get(0);
        Assert.assertEquals("hello", mockList.get(0));
    }

    @Test
    public void testInOrder_verifiesInteractionsInOrder() {
        List<String> firstMock = Mockito.mock(List.class);
        List<String> secondMock = Mockito.mock(List.class);

        firstMock.add("first");
        secondMock.add("second");

        InOrder inOrder = Mockito.inOrder(firstMock, secondMock);
        Assert.assertNotNull(inOrder);
        inOrder.verify(firstMock).add("first");
        inOrder.verify(secondMock).add("second");
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testInOrder_outOfOrderInteractions_throwsException() {
        List<String> firstMock = Mockito.mock(List.class);
        List<String> secondMock = Mockito.mock(List.class);

        firstMock.add("first");
        secondMock.add("second");

        InOrder inOrder = Mockito.inOrder(firstMock, secondMock);
        inOrder.verify(secondMock).add("second");
        inOrder.verify(firstMock).add("first");
    }

    @Test
    public void testTimes_zeroAndPositive_returnsVerificationModes() {
        Assert.assertNotNull(Mockito.times(0));
        Assert.assertNotNull(Mockito.times(5));
    }

    @Test(expected = MockitoException.class)
    public void testTimes_negative_throwsMockitoException() {
        Mockito.times(-1);
    }

    @Test
    public void testNever_returnsVerificationMode() {
        Assert.assertNotNull(Mockito.never());
    }

    @Test
    public void testAtLeastOnce_returnsVerificationMode() {
        Assert.assertNotNull(Mockito.atLeastOnce());
    }

    @Test
    public void testAtLeast_validCount_returnsVerificationMode() {
        Assert.assertNotNull(Mockito.atLeast(0));
        Assert.assertNotNull(Mockito.atLeast(3));
    }

    @Test(expected = MockitoException.class)
    public void testAtLeast_negativeCount_throwsMockitoException() {
        Mockito.atLeast(-1);
    }

    @Test
    public void testAtMost_validCount_returnsVerificationMode() {
        Assert.assertNotNull(Mockito.atMost(0));
        Assert.assertNotNull(Mockito.atMost(4));
    }

    @Test(expected = MockitoException.class)
    public void testAtMost_negativeCount_throwsMockitoException() {
        Mockito.atMost(-1);
    }

    @Test
    public void testOnly_returnsVerificationMode() {
        Assert.assertNotNull(Mockito.only());
    }

    @Test
    public void testValidateMockitoUsage_validState_doesNotThrow() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void testWithSettings_returnsMockSettings() {
        MockSettings settings = Mockito.withSettings();
        Assert.assertNotNull(settings);
    }

    @Test
    public void testDebug_returnsMockitoDebugger() {
        MockitoDebugger debugger = Mockito.debug();
        Assert.assertNotNull(debugger);
    }

    @Test
    public void testAnswerConstants_areNotNull() {
        Assert.assertNotNull(Mockito.RETURNS_DEFAULTS);
        Assert.assertNotNull(Mockito.RETURNS_SMART_NULLS);
        Assert.assertNotNull(Mockito.RETURNS_MOCKS);
        Assert.assertNotNull(Mockito.CALLS_REAL_METHODS);
    }

    @Test
    public void testReturnsSmartNulls_returnsSmartNullForUnstubbedMethod() {
        List<?> mockList = Mockito.mock(List.class, Mockito.RETURNS_SMART_NULLS);
        Object obj = mockList.get(0);
        Assert.assertNotNull(obj);
    }

    @Test
    public void testReturnsMocks_returnsMockForUnstubbedMethodReturningInterface() {
        java.util.Map<?, ?> mockMap = Mockito.mock(java.util.Map.class, Mockito.RETURNS_MOCKS);
        java.util.Set<?> keySet = mockMap.keySet();
        Assert.assertNotNull(keySet);
    }

    @Test(expected = TooLittleActualInvocations.class)
    public void testVerify_tooLittleInvocations_throwsException() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("item");
        Mockito.verify(mockList, Mockito.times(2)).add("item");
    }

    @Test(expected = TooManyActualInvocations.class)
    public void testVerify_tooManyInvocations_throwsException() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("item");
        mockList.add("item");
        mockList.add("item");
        Mockito.verify(mockList, Mockito.times(2)).add("item");
    }
}
