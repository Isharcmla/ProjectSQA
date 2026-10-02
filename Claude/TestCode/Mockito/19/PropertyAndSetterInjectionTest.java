package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;

import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PropertyAndSetterInjectionTest {

    private PropertyAndSetterInjection injection;

    @Before
    public void setUp() {
        injection = new PropertyAndSetterInjection();
    }

    // ---------- Helper domain classes ----------

    static class Dependency {
    }

    static class OtherDependency {
    }

    static class ServiceWithSetter {
        private Dependency dependency;

        public void setDependency(Dependency dependency) {
            this.dependency = dependency;
        }

        public Dependency getDependency() {
            return dependency;
        }
    }

    static class ServiceWithField {
        private Dependency dependency;

        public Dependency getDependency() {
            return dependency;
        }
    }

    static class ServiceWithDependencyOnly {
        private Dependency dependency;

        public Dependency getDependency() {
            return dependency;
        }
    }

    static abstract class AbstractService {
    }

    static class ParentService {
        private Dependency parentDependency;

        public void setParentDependency(Dependency d) {
            this.parentDependency = d;
        }

        public Dependency getParentDependency() {
            return parentDependency;
        }
    }

    static class ChildService extends ParentService {
        private OtherDependency childDependency;

        public void setChildDependency(OtherDependency d) {
            this.childDependency = d;
        }

        public OtherDependency getChildDependency() {
            return childDependency;
        }
    }

    static class ServiceWithFinalAndStaticFields {
        private static Dependency staticDependency;
        private final Dependency finalDependency = new Dependency();
        private Dependency normalDependency;

        public void setNormalDependency(Dependency d) {
            this.normalDependency = d;
        }

        public Dependency getNormalDependency() {
            return normalDependency;
        }

        public Dependency getFinalDependency() {
            return finalDependency;
        }

        public static Dependency getStaticDependency() {
            return staticDependency;
        }
    }

    // ---------- Owner classes (hold the field to be injected) ----------

    static class OwnerWithSetterService {
        private ServiceWithSetter serviceUnderTest = new ServiceWithSetter();
    }

    static class OwnerWithFieldService {
        private ServiceWithField serviceUnderTest = new ServiceWithField();
    }

    static class OwnerWithNullService {
        private ServiceWithSetter serviceUnderTest;
    }

    static class OwnerWithAbstractField {
        private AbstractService abstractField;
    }

    static class OwnerWithChildService {
        private ChildService serviceUnderTest = new ChildService();
    }

    static class OwnerWithFinalStaticService {
        private ServiceWithFinalAndStaticFields serviceUnderTest = new ServiceWithFinalAndStaticFields();
    }

    static class OwnerWithDependencyOnlyService {
        private ServiceWithDependencyOnly serviceUnderTest = new ServiceWithDependencyOnly();
    }

    // ---------- Helper method ----------

    private Field getField(Class<?> clazz, String name) throws NoSuchFieldException {
        Field f = clazz.getDeclaredField(name);
        f.setAccessible(true);
        return f;
    }

    // ---------- Test cases ----------

    @Test
    public void testProcessInjection_setterInjection_mockInjectedViaSetter() throws Exception {
        OwnerWithSetterService owner = new OwnerWithSetterService();
        Field field = getField(OwnerWithSetterService.class, "serviceUnderTest");

        Dependency mockDependency = new Dependency();
        Set<Object> mockCandidates = new HashSet<Object>(Arrays.asList(mockDependency));

        boolean result = injection.processInjection(field, owner, mockCandidates);

        assertTrue(result);
        assertSame(mockDependency, owner.serviceUnderTest.getDependency());
    }

    @Test
    public void testProcessInjection_fieldInjection_whenNoSetterAvailable() throws Exception {
        OwnerWithFieldService owner = new OwnerWithFieldService();
        Field field = getField(OwnerWithFieldService.class, "serviceUnderTest");

        Dependency mockDependency = new Dependency();
        Set<Object> mockCandidates = new HashSet<Object>(Arrays.asList(mockDependency));

        boolean result = injection.processInjection(field, owner, mockCandidates);

        assertTrue(result);
        assertSame(mockDependency, owner.serviceUnderTest.getDependency());
    }

    @Test
    public void testProcessInjection_emptyMockCandidates_returnsFalse() throws Exception {
        OwnerWithSetterService owner = new OwnerWithSetterService();
        Field field = getField(OwnerWithSetterService.class, "serviceUnderTest");

        Set<Object> mockCandidates = new HashSet<Object>();

        boolean result = injection.processInjection(field, owner, mockCandidates);

        assertFalse(result);
        assertNull(owner.serviceUnderTest.getDependency());
    }

    @Test
    public void testProcessInjection_nullFieldAutoInitialized_injectsSuccessfully() throws Exception {
        OwnerWithNullService owner = new OwnerWithNullService();
        Field field = getField(OwnerWithNullService.class, "serviceUnderTest");

        Dependency mockDependency = new Dependency();
        Set<Object> mockCandidates = new HashSet<Object>(Arrays.asList(mockDependency));

        boolean result = injection.processInjection(field, owner, mockCandidates);

        assertTrue(result);
        assertNotNull(owner.serviceUnderTest);
        assertSame(mockDependency, owner.serviceUnderTest.getDependency());
    }

    @Test
    public void testProcessInjection_superclassHierarchy_injectsFieldsInParentAndChild() throws Exception {
        OwnerWithChildService owner = new OwnerWithChildService();
        Field field = getField(OwnerWithChildService.class, "serviceUnderTest");

        Dependency parentMock = new Dependency();
        OtherDependency childMock = new OtherDependency();
        Set<Object> mockCandidates = new HashSet<Object>(Arrays.asList((Object) parentMock, childMock));

        boolean result = injection.processInjection(field, owner, mockCandidates);

        assertTrue(result);
        assertSame(parentMock, owner.serviceUnderTest.getParentDependency());
        assertSame(childMock, owner.serviceUnderTest.getChildDependency());
    }

    @Test(expected = MockitoException.class)
    public void testProcessInjection_abstractFieldCannotBeInitialized_throwsMockitoException() throws Exception {
        OwnerWithAbstractField owner = new OwnerWithAbstractField();
        Field field = getField(OwnerWithAbstractField.class, "abstractField");

        Set<Object> mockCandidates = new HashSet<Object>();

        injection.processInjection(field, owner, mockCandidates);
    }

    @Test
    public void testProcessInjection_finalAndStaticFieldsAreIgnored() throws Exception {
        OwnerWithFinalStaticService owner = new OwnerWithFinalStaticService();
        Field field = getField(OwnerWithFinalStaticService.class, "serviceUnderTest");

        Dependency originalFinal = owner.serviceUnderTest.getFinalDependency();
        Dependency mockDependency = new Dependency();
        Set<Object> mockCandidates = new HashSet<Object>(Arrays.asList(mockDependency));

        boolean result = injection.processInjection(field, owner, mockCandidates);

        assertTrue(result);
        assertSame(mockDependency, owner.serviceUnderTest.getNormalDependency());
        assertSame(originalFinal, owner.serviceUnderTest.getFinalDependency());
        assertNull(ServiceWithFinalAndStaticFields.getStaticDependency());
    }

    @Test
    public void testProcessInjection_noMatchingFieldType_returnsFalse() throws Exception {
        OwnerWithDependencyOnlyService owner = new OwnerWithDependencyOnlyService();
        Field field = getField(OwnerWithDependencyOnlyService.class, "serviceUnderTest");

        String unrelatedMock = "notADependency";
        Set<Object> mockCandidates = new HashSet<Object>(Arrays.asList((Object) unrelatedMock));

        boolean result = injection.processInjection(field, owner, mockCandidates);

        assertFalse(result);
        assertNull(owner.serviceUnderTest.getDependency());
    }

    @Test
    public void testProcessInjection_multipleCallsOnSameOwner_doesNotFailAndKeepsInjectedValue() throws Exception {
        OwnerWithSetterService owner = new OwnerWithSetterService();
        Field field = getField(OwnerWithSetterService.class, "serviceUnderTest");

        Dependency mockDependency = new Dependency();
        Set<Object> mockCandidates = new HashSet<Object>(Arrays.asList(mockDependency));

        boolean firstResult = injection.processInjection(field, owner, mockCandidates);
        boolean secondResult = injection.processInjection(field, owner, mockCandidates);

        assertTrue(firstResult);
        assertTrue(secondResult);
        assertSame(mockDependency, owner.serviceUnderTest.getDependency());
    }
}
