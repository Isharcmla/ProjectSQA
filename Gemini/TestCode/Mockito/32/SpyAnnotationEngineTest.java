package org.mockito.internal.configuration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SpyAnnotationEngineTest {

    private SpyAnnotationEngine engine;
    private MockUtil mockUtil;

    @Before
    public void setUp() {
        engine = new SpyAnnotationEngine();
        mockUtil = new MockUtil();
    }

    private static class ValidTestClass {
        @Spy
        List<String> spiedList = new ArrayList<String>();
    }

    private static class NullFieldTestClass {
        @Spy
        List<String> nullList = null;
    }

    private static class AlreadyMockedTestClass {
        @Spy
        List<String> alreadyMockedList = Mockito.spy(new ArrayList<String>());
    }

    private static class NoAnnotationTestClass {
        List<String> normalList = new ArrayList<String>();
    }

    private static class ConflictingMockTestClass {
        @Spy
        @Mock
        List<String> invalidField = new ArrayList<String>();
    }

    @SuppressWarnings("deprecation")
    private static class ConflictingDeprecatedMockTestClass {
        @Spy
        @org.mockito.MockitoAnnotations.Mock
        List<String> invalidField = new ArrayList<String>();
    }

    private static class ConflictingCaptorTestClass {
        @Spy
        @Captor
        List<String> invalidField = new ArrayList<String>();
    }

    private static class PrivateFieldTestClass {
        @Spy
        private List<String> privateList = new ArrayList<String>();

        public List<String> getPrivateList() {
            return privateList;
        }
    }

    private static class EmptyTestClass {
    }

    @Test
    public void testCreateMockFor_alwaysReturnsNull() {
        Object result = engine.createMockFor(null, null);
        Assert.assertNull(result);
    }

    @Test
    public void testProcess_validSpyField_shouldWrapWithSpy() {
        ValidTestClass target = new ValidTestClass();
        Assert.assertFalse(mockUtil.isMock(target.spiedList));

        engine.process(ValidTestClass.class, target);

        Assert.assertTrue(mockUtil.isMock(target.spiedList));
        Assert.assertTrue(mockUtil.isSpy(target.spiedList));
    }

    @Test(expected = MockitoException.class)
    public void testProcess_nullSpyInstance_shouldThrowMockitoException() {
        NullFieldTestClass target = new NullFieldTestClass();
        engine.process(NullFieldTestClass.class, target);
    }

    @Test
    public void testProcess_alreadySpiedField_shouldResetMock() {
        AlreadyMockedTestClass target = new AlreadyMockedTestClass();
        target.alreadyMockedList.add("test");
        Assert.assertEquals(1, target.alreadyMockedList.size());

        engine.process(AlreadyMockedTestClass.class, target);

        Assert.assertTrue(mockUtil.isMock(target.alreadyMockedList));
    }

    @Test
    public void testProcess_noSpyAnnotation_shouldIgnoreField() {
        NoAnnotationTestClass target = new NoAnnotationTestClass();
        engine.process(NoAnnotationTestClass.class, target);

        Assert.assertFalse(mockUtil.isMock(target.normalList));
    }

    @Test(expected = MockitoException.class)
    public void testProcess_conflictingWithMockAnnotation_shouldThrowException() {
        ConflictingMockTestClass target = new ConflictingMockTestClass();
        engine.process(ConflictingMockTestClass.class, target);
    }

    @Test(expected = MockitoException.class)
    public void testProcess_conflictingWithDeprecatedMockAnnotation_shouldThrowException() {
        ConflictingDeprecatedMockTestClass target = new ConflictingDeprecatedMockTestClass();
        engine.process(ConflictingDeprecatedMockTestClass.class, target);
    }

    @Test(expected = MockitoException.class)
    public void testProcess_conflictingWithCaptorAnnotation_shouldThrowException() {
        ConflictingCaptorTestClass target = new ConflictingCaptorTestClass();
        engine.process(ConflictingCaptorTestClass.class, target);
    }

    @Test
    public void testProcess_privateField_shouldRestoreAccessibility() throws NoSuchFieldException {
        PrivateFieldTestClass target = new PrivateFieldTestClass();
        Field field = PrivateFieldTestClass.class.getDeclaredField("privateList");
        field.setAccessible(false);

        engine.process(PrivateFieldTestClass.class, target);

        Assert.assertTrue(mockUtil.isMock(target.getPrivateList()));
        Assert.assertFalse(field.isAccessible());
    }

    @Test
    public void testProcess_emptyClass_shouldCompleteWithoutError() {
        EmptyTestClass target = new EmptyTestClass();
        engine.process(EmptyTestClass.class, target);
    }

    @Test
    public void testAssertNoAnnotations_noConflict_shouldPass() throws NoSuchFieldException {
        Field field = ValidTestClass.class.getDeclaredField("spiedList");
        engine.assertNoAnnotations(Spy.class, field, Mock.class, Captor.class);
    }

    @Test(expected = MockitoException.class)
    public void testAssertNoAnnotations_withConflict_shouldThrowException() throws NoSuchFieldException {
        Field field = ConflictingMockTestClass.class.getDeclaredField("invalidField");
        engine.assertNoAnnotations(Spy.class, field, Mock.class);
    }

    @Test
    public void testAssertNoAnnotations_emptyUndesiredAnnotations_shouldPass() throws NoSuchFieldException {
        Field field = ValidTestClass.class.getDeclaredField("spiedList");
        engine.assertNoAnnotations(Spy.class, field);
    }
}
