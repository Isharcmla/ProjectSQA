package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_120862705817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4263;
     Object term12068;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4276 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4286 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4263, term4263.getClass(), "type", -93135961);
        setIntField(term4265, term4265.getClass(), "type", 962840079);
        setIntField(term4267, term4267.getClass(), "type", 0);
        setField(term4267, term4267.getClass(), "next", null);
        setField(term4267, term4267.getClass(), "first", null);
        setField(term4267, term4267.getClass(), "last", null);
        setField(term4267, term4267.getClass(), "propListHead", null);
        setIntField(term4267, term4267.getClass(), "sourcePosition", 0);
        setField(term4267, term4267.getClass(), "jsType", null);
        setField(term4267, term4267.getClass(), "parent", null);
        setField(term4265, term4265.getClass(), "next", term4267);
        setIntField(term4270, term4270.getClass(), "type", 0);
        setField(term4270, term4270.getClass(), "next", null);
        setField(term4270, term4270.getClass(), "first", null);
        setField(term4270, term4270.getClass(), "last", null);
        setField(term4270, term4270.getClass(), "propListHead", null);
        setIntField(term4270, term4270.getClass(), "sourcePosition", 0);
        setField(term4270, term4270.getClass(), "jsType", null);
        setField(term4270, term4270.getClass(), "parent", null);
        setField(term4265, term4265.getClass(), "first", term4270);
        setIntField(term4273, term4273.getClass(), "type", 0);
        setField(term4273, term4273.getClass(), "next", null);
        setField(term4273, term4273.getClass(), "first", null);
        setField(term4273, term4273.getClass(), "last", null);
        setField(term4273, term4273.getClass(), "propListHead", null);
        setIntField(term4273, term4273.getClass(), "sourcePosition", 0);
        setField(term4273, term4273.getClass(), "jsType", null);
        setField(term4273, term4273.getClass(), "parent", null);
        setField(term4265, term4265.getClass(), "last", term4273);
        setField(term4276, term4276.getClass(), "next", null);
        setIntField(term4276, term4276.getClass(), "type", 0);
        setIntField(term4276, term4276.getClass(), "intValue", 0);
        setField(term4276, term4276.getClass(), "objectValue", null);
        setField(term4265, term4265.getClass(), "propListHead", term4276);
        setIntField(term4265, term4265.getClass(), "sourcePosition", 335112684);
        setField(term4265, term4265.getClass(), "jsType", null);
        setField(term4265, term4265.getClass(), "parent", null);
        setField(term4263, term4263.getClass(), "next", term4265);
        setIntField(term4280, term4280.getClass(), "type", 0);
        setField(term4280, term4280.getClass(), "next", null);
        setField(term4280, term4280.getClass(), "first", null);
        setField(term4280, term4280.getClass(), "last", null);
        setField(term4280, term4280.getClass(), "propListHead", null);
        setIntField(term4280, term4280.getClass(), "sourcePosition", 0);
        setField(term4280, term4280.getClass(), "jsType", null);
        setField(term4280, term4280.getClass(), "parent", null);
        setField(term4263, term4263.getClass(), "first", term4280);
        setIntField(term4283, term4283.getClass(), "type", 0);
        setField(term4283, term4283.getClass(), "next", null);
        setField(term4283, term4283.getClass(), "first", null);
        setField(term4283, term4283.getClass(), "last", null);
        setField(term4283, term4283.getClass(), "propListHead", null);
        setIntField(term4283, term4283.getClass(), "sourcePosition", 0);
        setField(term4283, term4283.getClass(), "jsType", null);
        setField(term4283, term4283.getClass(), "parent", null);
        setField(term4263, term4263.getClass(), "last", term4283);
        setField(term4286, term4286.getClass(), "next", null);
        setIntField(term4286, term4286.getClass(), "type", 0);
        setIntField(term4286, term4286.getClass(), "intValue", 0);
        setField(term4286, term4286.getClass(), "objectValue", null);
        setField(term4263, term4263.getClass(), "propListHead", term4286);
        setIntField(term4263, term4263.getClass(), "sourcePosition", 1551099402);
        setField(term4263, term4263.getClass(), "jsType", null);
        setField(term4263, term4263.getClass(), "parent", null);
        term12068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12073 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12076 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12068, term12068.getClass(), "type", -93135961);
        setIntField(term12069, term12069.getClass(), "type", 962840079);
        setIntField(term12070, term12070.getClass(), "type", 0);
        setField(term12070, term12070.getClass(), "next", null);
        setField(term12070, term12070.getClass(), "first", null);
        setField(term12070, term12070.getClass(), "last", null);
        setField(term12070, term12070.getClass(), "propListHead", null);
        setIntField(term12070, term12070.getClass(), "sourcePosition", 0);
        setField(term12070, term12070.getClass(), "jsType", null);
        setField(term12070, term12070.getClass(), "parent", null);
        setField(term12069, term12069.getClass(), "next", term12070);
        setIntField(term12071, term12071.getClass(), "type", 0);
        setField(term12071, term12071.getClass(), "next", null);
        setField(term12071, term12071.getClass(), "first", null);
        setField(term12071, term12071.getClass(), "last", null);
        setField(term12071, term12071.getClass(), "propListHead", null);
        setIntField(term12071, term12071.getClass(), "sourcePosition", 0);
        setField(term12071, term12071.getClass(), "jsType", null);
        setField(term12071, term12071.getClass(), "parent", null);
        setField(term12069, term12069.getClass(), "first", term12071);
        setIntField(term12072, term12072.getClass(), "type", 0);
        setField(term12072, term12072.getClass(), "next", null);
        setField(term12072, term12072.getClass(), "first", null);
        setField(term12072, term12072.getClass(), "last", null);
        setField(term12072, term12072.getClass(), "propListHead", null);
        setIntField(term12072, term12072.getClass(), "sourcePosition", 0);
        setField(term12072, term12072.getClass(), "jsType", null);
        setField(term12072, term12072.getClass(), "parent", null);
        setField(term12069, term12069.getClass(), "last", term12072);
        setField(term12073, term12073.getClass(), "next", null);
        setIntField(term12073, term12073.getClass(), "type", 0);
        setIntField(term12073, term12073.getClass(), "intValue", 0);
        setField(term12073, term12073.getClass(), "objectValue", null);
        setField(term12069, term12069.getClass(), "propListHead", term12073);
        setIntField(term12069, term12069.getClass(), "sourcePosition", 335112684);
        setField(term12069, term12069.getClass(), "jsType", null);
        setField(term12069, term12069.getClass(), "parent", null);
        setField(term12068, term12068.getClass(), "next", term12069);
        setIntField(term12074, term12074.getClass(), "type", 0);
        setField(term12074, term12074.getClass(), "next", null);
        setField(term12074, term12074.getClass(), "first", null);
        setField(term12074, term12074.getClass(), "last", null);
        setField(term12074, term12074.getClass(), "propListHead", null);
        setIntField(term12074, term12074.getClass(), "sourcePosition", 0);
        setField(term12074, term12074.getClass(), "jsType", null);
        setField(term12074, term12074.getClass(), "parent", null);
        setField(term12068, term12068.getClass(), "first", term12074);
        setIntField(term12075, term12075.getClass(), "type", 0);
        setField(term12075, term12075.getClass(), "next", null);
        setField(term12075, term12075.getClass(), "first", null);
        setField(term12075, term12075.getClass(), "last", null);
        setField(term12075, term12075.getClass(), "propListHead", null);
        setIntField(term12075, term12075.getClass(), "sourcePosition", 0);
        setField(term12075, term12075.getClass(), "jsType", null);
        setField(term12075, term12075.getClass(), "parent", null);
        setField(term12068, term12068.getClass(), "last", term12075);
        setField(term12076, term12076.getClass(), "next", null);
        setIntField(term12076, term12076.getClass(), "type", 0);
        setIntField(term12076, term12076.getClass(), "intValue", 0);
        setField(term12076, term12076.getClass(), "objectValue", null);
        setField(term12068, term12068.getClass(), "propListHead", term12076);
        setIntField(term12068, term12068.getClass(), "sourcePosition", 1551099402);
        setField(term12068, term12068.getClass(), "jsType", null);
        setField(term12068, term12068.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4263;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term4263, term12068));
        assertTrue(recursiveEquals(retValue, null));
    }

};


