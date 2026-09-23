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
import java.lang.Object;

public class NodeUtil_getFunctionJSDocInfo_80008384288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3846;

    public NodeUtil_getFunctionJSDocInfo_80008384288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3846, term3846.getClass(), "type", -2077814162);
        setIntField(term3848, term3848.getClass(), "type", 444514470);
        setIntField(term3850, term3850.getClass(), "type", -147055177);
        setIntField(term3852, term3852.getClass(), "type", 1979044375);
        setIntField(term3854, term3854.getClass(), "type", 961252909);
        setField(term3854, term3854.getClass(), "next", null);
        setField(term3854, term3854.getClass(), "first", null);
        setField(term3854, term3854.getClass(), "last", null);
        setField(term3854, term3854.getClass(), "propListHead", null);
        setIntField(term3854, term3854.getClass(), "sourcePosition", 0);
        setField(term3854, term3854.getClass(), "jsType", null);
        setField(term3854, term3854.getClass(), "parent", null);
        setField(term3852, term3852.getClass(), "next", term3854);
        setIntField(term3857, term3857.getClass(), "type", 1455842357);
        setField(term3857, term3857.getClass(), "next", null);
        setField(term3857, term3857.getClass(), "first", null);
        setField(term3857, term3857.getClass(), "last", term3854);
        setField(term3857, term3857.getClass(), "propListHead", null);
        setIntField(term3857, term3857.getClass(), "sourcePosition", 0);
        setField(term3857, term3857.getClass(), "jsType", null);
        setField(term3857, term3857.getClass(), "parent", null);
        setField(term3852, term3852.getClass(), "first", term3857);
        setField(term3852, term3852.getClass(), "last", term3850);
        setField(term3852, term3852.getClass(), "propListHead", null);
        setIntField(term3852, term3852.getClass(), "sourcePosition", 0);
        setField(term3852, term3852.getClass(), "jsType", null);
        setField(term3852, term3852.getClass(), "parent", null);
        setField(term3850, term3850.getClass(), "next", term3852);
        setField(term3850, term3850.getClass(), "first", term3854);
        setIntField(term3861, term3861.getClass(), "type", 923905351);
        setIntField(term3863, term3863.getClass(), "type", 428360161);
        setField(term3863, term3863.getClass(), "next", null);
        setField(term3863, term3863.getClass(), "first", term3857);
        setField(term3863, term3863.getClass(), "last", term3852);
        setField(term3863, term3863.getClass(), "propListHead", null);
        setIntField(term3863, term3863.getClass(), "sourcePosition", 0);
        setField(term3863, term3863.getClass(), "jsType", null);
        setField(term3863, term3863.getClass(), "parent", null);
        setField(term3861, term3861.getClass(), "next", term3863);
        setField(term3861, term3861.getClass(), "first", term3848);
        setField(term3861, term3861.getClass(), "last", term3848);
        setField(term3861, term3861.getClass(), "propListHead", null);
        setIntField(term3861, term3861.getClass(), "sourcePosition", 0);
        setField(term3861, term3861.getClass(), "jsType", null);
        setField(term3861, term3861.getClass(), "parent", null);
        setField(term3850, term3850.getClass(), "last", term3861);
        setField(term3850, term3850.getClass(), "propListHead", null);
        setIntField(term3850, term3850.getClass(), "sourcePosition", 0);
        setField(term3850, term3850.getClass(), "jsType", null);
        setField(term3850, term3850.getClass(), "parent", null);
        setField(term3848, term3848.getClass(), "next", term3850);
        setIntField(term3868, term3868.getClass(), "type", 631528579);
        setField(term3868, term3868.getClass(), "next", term3861);
        setField(term3868, term3868.getClass(), "first", term3863);
        setField(term3868, term3868.getClass(), "last", term3846);
        setField(term3868, term3868.getClass(), "propListHead", null);
        setIntField(term3868, term3868.getClass(), "sourcePosition", 0);
        setField(term3868, term3868.getClass(), "jsType", null);
        setField(term3868, term3868.getClass(), "parent", null);
        setField(term3848, term3848.getClass(), "first", term3868);
        setField(term3848, term3848.getClass(), "last", term3868);
        setField(term3848, term3848.getClass(), "propListHead", null);
        setIntField(term3848, term3848.getClass(), "sourcePosition", 0);
        setField(term3848, term3848.getClass(), "jsType", null);
        setField(term3848, term3848.getClass(), "parent", null);
        setField(term3846, term3846.getClass(), "next", term3848);
        setField(term3846, term3846.getClass(), "first", term3852);
        setField(term3846, term3846.getClass(), "last", term3854);
        setField(term3846, term3846.getClass(), "propListHead", null);
        setIntField(term3846, term3846.getClass(), "sourcePosition", 0);
        setField(term3846, term3846.getClass(), "jsType", null);
        setField(term3846, term3846.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3846;
        try {
            callMethod(klass, "getFunctionJSDocInfo", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


