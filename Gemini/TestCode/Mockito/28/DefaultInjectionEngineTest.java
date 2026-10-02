package org.mockito.internal.configuration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DefaultInjectionEngineTest {

    private DefaultInjectionEngine injectionEngine;

    @Before
    public void setUp() {
        injectionEngine = new DefaultInjectionEngine();
    }

    // --- Helper classes for testing ---

    static class BaseType {}
    static class SubType extends BaseType {}
    static class OtherType {}

    static class SuperClass {
        BaseType superField;
    }

    static class TargetService extends SuperClass {
        SubType subField;
        BaseType baseField;
        OtherType otherField1;
        OtherType otherField2;
    }

    static class TestContainer {
        TargetService targetService;
    }

    static class TestContainerPreInitialized {
        TargetService targetService = new TargetService();
    }

    static class TestContainerInterface {
        Runnable runnableField;
    }

    static class NameMatchingService {
        String specificName;
        String otherName;
    }

    static class TestContainerNameMatching {
        NameMatchingService nameMatchingService;
    }

    // --- Tests ---

    @Test
    public void testInjectMocksOnFields_emptyInjectMocksFields_doesNothing() {
        TestContainer testInstance = new TestContainer();
        Set<Field> fields = Collections.emptySet();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new SubType());

        injectionEngine.injectMocksOnFields(fields, mocks, testInstance);

        Assert.assertNull(testInstance.targetService);
    }

    @Test
    public void testInjectMocksOnFields_emptyMocks_initializesTargetFieldWithoutInjection() {
        TestContainer testInstance = new TestContainer();
        Set<Field> fields = getFields(TestContainer.class, "targetService");
        Set<Object> mocks = Collections.emptySet();

        injectionEngine.injectMocksOnFields(fields, mocks, testInstance);

        Assert.assertNotNull(testInstance.targetService);
        Assert.assertNull(testInstance.targetService.subField);
        Assert.assertNull(testInstance.targetService.baseField);
        Assert.assertNull(testInstance.targetService.superField);
    }

    @Test
    public void testInjectMocksOnFields_hierarchyAndComparatorCoverage_injectsAllCandidates() {
        TestContainer testInstance = new TestContainer();
        Set<Field> fields = getFields(TestContainer.class, "targetService");

        SubType subTypeMock = new SubType();
        BaseType baseTypeMock = new BaseType();
        OtherType otherMock = new OtherType();

        Set<Object> mocks = new HashSet<Object>();
        mocks.add(subTypeMock);
        mocks.add(baseTypeMock);
        mocks.add(otherMock);

        injectionEngine.injectMocksOnFields(fields, mocks, testInstance);

        Assert.assertNotNull(testInstance.targetService);
        Assert.assertNotNull(testInstance.targetService.subField);
        Assert.assertEquals(subTypeMock, testInstance.targetService.subField);
        Assert.assertNotNull(testInstance.targetService.baseField);
        Assert.assertEquals(baseTypeMock, testInstance.targetService.baseField);
        Assert.assertNotNull(testInstance.targetService.otherField1);
        Assert.assertEquals(otherMock, testInstance.targetService.otherField1);
    }

    @Test
    public void testInjectMocksOnFields_preInitializedTargetInstance_injectsDependenciesSuccessfully() {
        TestContainerPreInitialized testInstance = new TestContainerPreInitialized();
        TargetService existingInstance = testInstance.targetService;
        Set<Field> fields = getFields(TestContainerPreInitialized.class, "targetService");

        SubType subTypeMock = new SubType();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(subTypeMock);

        injectionEngine.injectMocksOnFields(fields, mocks, testInstance);

        Assert.assertSame(existingInstance, testInstance.targetService);
        Assert.assertSame(subTypeMock, testInstance.targetService.subField);
    }

    @Test
    public void testInjectMocksOnFields_multipleCandidatesOfSameType_matchesByName() {
        TestContainerNameMatching testInstance = new TestContainerNameMatching();
        Set<Field> fields = getFields(TestContainerNameMatching.class, "nameMatchingService");

        String specificName = "matchedValue";
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(specificName);

        injectionEngine.injectMocksOnFields(fields, mocks, testInstance);

        Assert.assertNotNull(testInstance.nameMatchingService);
        Assert.assertEquals(specificName, testInstance.nameMatchingService.specificName);
        Assert.assertNull(testInstance.nameMatchingService.otherName);
    }

    @Test(expected = MockitoException.class)
    public void testInjectMocksOnFields_uninstantiableField_throwsMockitoException() {
        TestContainerInterface testInstance = new TestContainerInterface();
        Set<Field> fields = getFields(TestContainerInterface.class, "runnableField");
        Set<Object> mocks = Collections.emptySet();

        injectionEngine.injectMocksOnFields(fields, mocks, testInstance);
    }

    // --- Helper methods ---

    private Set<Field> getFields(Class<?> clazz, String... fieldNames) {
        Set<Field> fields = new HashSet<Field>();
        for (String fieldName : fieldNames) {
            try {
                fields.add(clazz.getDeclaredField(fieldName));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
        return fields;
    }
}
