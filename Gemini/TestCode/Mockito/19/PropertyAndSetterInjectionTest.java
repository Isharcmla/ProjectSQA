package org.mockito.internal.configuration.injection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PropertyAndSetterInjectionTest {

    private PropertyAndSetterInjection injection;

    public static class DependencyA {}
    public static class DependencyB {}

    public static class SuperTarget {
        private DependencyA superField;

        public DependencyA getSuperField() {
            return superField;
        }
    }

    public static class SubTarget extends SuperTarget {
        private DependencyB subField;
        private DependencyA setterField;
        private boolean setterCalled = false;

        public static DependencyA staticField;
        public final DependencyA finalField = new DependencyA();

        public void setSetterField(DependencyA setterField) {
            this.setterField = setterField;
            this.setterCalled = true;
        }

        public DependencyB getSubField() {
            return subField;
        }

        public DependencyA getSetterField() {
            return setterField;
        }

        public boolean isSetterCalled() {
            return setterCalled;
        }
    }

    public static class MultipleCandidatesTarget {
        private DependencyA first;
        private DependencyA second;

        public DependencyA getFirst() {
            return first;
        }

        public DependencyA getSecond() {
            return second;
        }
    }

    public static class ThrowingConstructorTarget {
        public ThrowingConstructorTarget() {
            throw new RuntimeException("Constructor failed");
        }
    }

    public static class NoDefaultConstructorTarget {
        public NoDefaultConstructorTarget(String arg) {}
    }

    public static class TestOwner {
        public SubTarget subTarget;
        public SubTarget initializedSubTarget = new SubTarget();
        public MultipleCandidatesTarget multipleTarget;
        public ThrowingConstructorTarget throwingTarget;
        public NoDefaultConstructorTarget noDefaultConstructorTarget;
    }

    @Before
    public void setUp() {
        injection = new PropertyAndSetterInjection();
    }

    @Test
    public void testProcessInjection_emptyCandidates_returnsFalse() throws Exception {
        TestOwner owner = new TestOwner();
        Field field = TestOwner.class.getDeclaredField("subTarget");
        Set<Object> candidates = new HashSet<Object>();

        boolean result = injection.processInjection(field, owner, candidates);

        Assert.assertFalse(result);
        Assert.assertNotNull(owner.subTarget);
        Assert.assertNull(owner.subTarget.getSubField());
    }

    @Test
    public void testProcessInjection_injectsFieldsAndCallsSetterAcrossHierarchy() throws Exception {
        TestOwner owner = new TestOwner();
        Field field = TestOwner.class.getDeclaredField("subTarget");

        DependencyA depA = new DependencyA();
        DependencyB depB = new DependencyB();

        Set<Object> candidates = new HashSet<Object>();
        candidates.add(depA);
        candidates.add(depB);

        boolean result = injection.processInjection(field, owner, candidates);

        Assert.assertTrue(result);
        Assert.assertNotNull(owner.subTarget);
        Assert.assertSame(depB, owner.subTarget.getSubField());
        Assert.assertTrue(owner.subTarget.isSetterCalled());
        Assert.assertSame(depA, owner.subTarget.getSetterField());
    }

    @Test
    public void testProcessInjection_alreadyInitializedTarget_injectsWithoutReinstantiation() throws Exception {
        TestOwner owner = new TestOwner();
        SubTarget originalInstance = owner.initializedSubTarget;
        Field field = TestOwner.class.getDeclaredField("initializedSubTarget");

        DependencyB depB = new DependencyB();
        Set<Object> candidates = new HashSet<Object>(Collections.singletonList(depB));

        boolean result = injection.processInjection(field, owner, candidates);

        Assert.assertTrue(result);
        Assert.assertSame(originalInstance, owner.initializedSubTarget);
        Assert.assertSame(depB, owner.initializedSubTarget.getSubField());
    }

    @Test
    public void testProcessInjection_ignoresStaticAndFinalFields() throws Exception {
        TestOwner owner = new TestOwner();
        Field field = TestOwner.class.getDeclaredField("subTarget");

        DependencyA depA = new DependencyA();
        Set<Object> candidates = new HashSet<Object>(Collections.singletonList(depA));

        SubTarget.staticField = null;

        injection.processInjection(field, owner, candidates);

        Assert.assertNull(SubTarget.staticField);
        Assert.assertNotSame(depA, owner.subTarget.finalField);
    }

    @Test
    public void testProcessInjection_multipleCandidates_matchesByName() throws Exception {
        TestOwner owner = new TestOwner();
        Field field = TestOwner.class.getDeclaredField("multipleTarget");

        DependencyA firstCandidate = new DependencyA();
        DependencyA secondCandidate = new DependencyA();

        Set<Object> candidates = new HashSet<Object>();
        candidates.add(firstCandidate);
        candidates.add(secondCandidate);

        boolean result = injection.processInjection(field, owner, candidates);

        Assert.assertTrue(result);
        Assert.assertNotNull(owner.multipleTarget);
        Assert.assertNotNull(owner.multipleTarget.getFirst());
        Assert.assertNotNull(owner.multipleTarget.getSecond());
        Assert.assertNotSame(owner.multipleTarget.getFirst(), owner.multipleTarget.getSecond());
    }

    @Test(expected = MockitoException.class)
    public void testProcessInjection_constructorThrowsException_throwsMockitoException() throws Exception {
        TestOwner owner = new TestOwner();
        Field field = TestOwner.class.getDeclaredField("throwingTarget");
        Set<Object> candidates = new HashSet<Object>();

        injection.processInjection(field, owner, candidates);
    }

    @Test(expected = MockitoException.class)
    public void testProcessInjection_noDefaultConstructor_throwsMockitoException() throws Exception {
        TestOwner owner = new TestOwner();
        Field field = TestOwner.class.getDeclaredField("noDefaultConstructorTarget");
        Set<Object> candidates = new HashSet<Object>();

        injection.processInjection(field, owner, candidates);
    }
}
