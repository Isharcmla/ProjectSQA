package com.fasterxml.jackson.databind.jsontype.impl;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;

public class StdSubtypeResolverTest {

    static class BaseBean {
        public String value;
    }

    static class SubBean extends BaseBean {
        public int extra;
    }

    static class UnrelatedBean {
        public String name;
    }

    abstract static class AbstractBase {
        public String x;
    }

    private ObjectMapper mapper;
    private MapperConfig<?> config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    private AnnotatedMember firstField(Class<?> cls) {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, cls);
        Iterator<AnnotatedField> it = ac.fields().iterator();
        return it.hasNext() ? it.next() : null;
    }

    // ---------------------------------------------------------------
    // registerSubtypes(NamedType...)
    // ---------------------------------------------------------------

    @Test
    public void testRegisterSubtypes_withNamedTypes_addsToRegisteredSet() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        NamedType nt = new NamedType(SubBean.class, "sub");
        resolver.registerSubtypes(nt);

        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, baseType);

        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == SubBean.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testRegisterSubtypes_withMultipleNamedTypes_registersAll() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(SubBean.class, "sub"),
                new NamedType(UnrelatedBean.class, "unrelated"));

        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, baseType);

        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == SubBean.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    // ---------------------------------------------------------------
    // registerSubtypes(Class<?>...)
    // ---------------------------------------------------------------

    @Test
    public void testRegisterSubtypes_withClasses_addsToRegisteredSet() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(SubBean.class);

        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, baseType);

        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == SubBean.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testRegisterSubtypes_emptyArray_noEffectButNoException() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new Class<?>[0]);

        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, baseType);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // collectAndResolveSubtypesByClass(config, AnnotatedMember, JavaType)
    // ---------------------------------------------------------------

    @Test
    public void testCollectAndResolveSubtypesByClass_withPropertyAndBaseType_returnsBaseTypeIncluded() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, baseType);

        assertNotNull(result);
        boolean foundBase = false;
        for (NamedType t : result) {
            if (t.getType() == BaseBean.class) {
                foundBase = true;
            }
        }
        assertTrue(foundBase);
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_withNullBaseType_usesPropertyRawType() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, null);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testCollectAndResolveSubtypesByClass_withNullPropertyAndNullBaseType_throwsNPE() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.collectAndResolveSubtypesByClass(config, (AnnotatedMember) null, null);
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_unrelatedRegisteredSubtype_notIncluded() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(UnrelatedBean.class);

        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, baseType);

        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == UnrelatedBean.class) {
                found = true;
            }
        }
        assertFalse(found);
    }

    // ---------------------------------------------------------------
    // collectAndResolveSubtypesByClass(config, AnnotatedClass)
    // ---------------------------------------------------------------

    @Test
    public void testCollectAndResolveSubtypesByClass_withAnnotatedClass_returnsResult() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(SubBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, ac);

        assertNotNull(result);
        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == SubBean.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_noRegisteredSubtypes_returnsAtLeastBase() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, ac);

        assertNotNull(result);
        boolean foundBase = false;
        for (NamedType t : result) {
            if (t.getType() == BaseBean.class) {
                foundBase = true;
            }
        }
        assertTrue(foundBase);
    }

    // ---------------------------------------------------------------
    // collectAndResolveSubtypesByTypeId(config, AnnotatedMember, JavaType)
    // ---------------------------------------------------------------

    @Test
    public void testCollectAndResolveSubtypesByTypeId_withPropertyAndBaseType_returnsResult() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(SubBean.class, "sub"));

        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, member, baseType);

        assertNotNull(result);
        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == SubBean.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test(expected = NullPointerException.class)
    public void testCollectAndResolveSubtypesByTypeId_withNullBaseType_throwsNPE() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        AnnotatedMember member = firstField(BaseBean.class);
        resolver.collectAndResolveSubtypesByTypeId(config, member, null);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_unrelatedRegisteredSubtype_notIncluded() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(UnrelatedBean.class);

        JavaType baseType = mapper.constructType(BaseBean.class);
        AnnotatedMember member = firstField(BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, member, baseType);

        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == UnrelatedBean.class) {
                found = true;
            }
        }
        assertFalse(found);
    }

    // ---------------------------------------------------------------
    // collectAndResolveSubtypesByTypeId(config, AnnotatedClass)
    // ---------------------------------------------------------------

    @Test
    public void testCollectAndResolveSubtypesByTypeId_withAnnotatedClass_returnsResult() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(SubBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, ac);

        assertNotNull(result);
        boolean found = false;
        for (NamedType t : result) {
            if (t.getType() == SubBean.class) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_abstractBaseTypeItself_excludedWhenNoName() {
        // Covers the branch in _combineNamedAndUnnamed that skips abstract
        // base type when it has no explicit name and no concrete registration
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, AbstractBase.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, ac);

        boolean foundAbstractBaseItself = false;
        for (NamedType t : result) {
            if (t.getType() == AbstractBase.class) {
                foundAbstractBaseItself = true;
            }
        }
        assertFalse(foundAbstractBaseItself);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_concreteBaseTypeItself_includedWhenNoRegisteredSubtypes() {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, BaseBean.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, ac);

        boolean foundBaseItself = false;
        for (NamedType t : result) {
            if (t.getType() == BaseBean.class) {
                foundBaseItself = true;
            }
        }
        assertTrue(foundBaseItself);
    }
}
