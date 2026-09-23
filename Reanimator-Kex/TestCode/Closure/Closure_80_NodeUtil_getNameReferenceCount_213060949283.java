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

public class NodeUtil_getNameReferenceCount_213060949283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3841;
     Object term22710;

    public NodeUtil_getNameReferenceCount_213060949283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3854 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3864 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3841, term3841.getClass(), "type", 942412391);
        setIntField(term3843, term3843.getClass(), "type", -1308902065);
        setIntField(term3845, term3845.getClass(), "type", 0);
        setField(term3845, term3845.getClass(), "next", null);
        setField(term3845, term3845.getClass(), "first", null);
        setField(term3845, term3845.getClass(), "last", null);
        setField(term3845, term3845.getClass(), "propListHead", null);
        setIntField(term3845, term3845.getClass(), "sourcePosition", 0);
        setField(term3845, term3845.getClass(), "jsType", null);
        setField(term3845, term3845.getClass(), "parent", null);
        setField(term3843, term3843.getClass(), "next", term3845);
        setIntField(term3848, term3848.getClass(), "type", 0);
        setField(term3848, term3848.getClass(), "next", null);
        setField(term3848, term3848.getClass(), "first", null);
        setField(term3848, term3848.getClass(), "last", null);
        setField(term3848, term3848.getClass(), "propListHead", null);
        setIntField(term3848, term3848.getClass(), "sourcePosition", 0);
        setField(term3848, term3848.getClass(), "jsType", null);
        setField(term3848, term3848.getClass(), "parent", null);
        setField(term3843, term3843.getClass(), "first", term3848);
        setIntField(term3851, term3851.getClass(), "type", 0);
        setField(term3851, term3851.getClass(), "next", null);
        setField(term3851, term3851.getClass(), "first", null);
        setField(term3851, term3851.getClass(), "last", null);
        setField(term3851, term3851.getClass(), "propListHead", null);
        setIntField(term3851, term3851.getClass(), "sourcePosition", 0);
        setField(term3851, term3851.getClass(), "jsType", null);
        setField(term3851, term3851.getClass(), "parent", null);
        setField(term3843, term3843.getClass(), "last", term3851);
        setField(term3854, term3854.getClass(), "next", null);
        setIntField(term3854, term3854.getClass(), "type", 0);
        setIntField(term3854, term3854.getClass(), "intValue", 0);
        setField(term3854, term3854.getClass(), "objectValue", null);
        setField(term3843, term3843.getClass(), "propListHead", term3854);
        setIntField(term3843, term3843.getClass(), "sourcePosition", -1122596893);
        setField(term3843, term3843.getClass(), "jsType", null);
        setField(term3843, term3843.getClass(), "parent", null);
        setField(term3841, term3841.getClass(), "next", term3843);
        setIntField(term3858, term3858.getClass(), "type", 0);
        setField(term3858, term3858.getClass(), "next", null);
        setField(term3858, term3858.getClass(), "first", null);
        setField(term3858, term3858.getClass(), "last", null);
        setField(term3858, term3858.getClass(), "propListHead", null);
        setIntField(term3858, term3858.getClass(), "sourcePosition", 0);
        setField(term3858, term3858.getClass(), "jsType", null);
        setField(term3858, term3858.getClass(), "parent", null);
        setField(term3841, term3841.getClass(), "first", term3858);
        setIntField(term3861, term3861.getClass(), "type", 0);
        setField(term3861, term3861.getClass(), "next", null);
        setField(term3861, term3861.getClass(), "first", null);
        setField(term3861, term3861.getClass(), "last", null);
        setField(term3861, term3861.getClass(), "propListHead", null);
        setIntField(term3861, term3861.getClass(), "sourcePosition", 0);
        setField(term3861, term3861.getClass(), "jsType", null);
        setField(term3861, term3861.getClass(), "parent", null);
        setField(term3841, term3841.getClass(), "last", term3861);
        setField(term3864, term3864.getClass(), "next", null);
        setIntField(term3864, term3864.getClass(), "type", 0);
        setIntField(term3864, term3864.getClass(), "intValue", 0);
        setField(term3864, term3864.getClass(), "objectValue", null);
        setField(term3841, term3841.getClass(), "propListHead", term3864);
        setIntField(term3841, term3841.getClass(), "sourcePosition", -2147297900);
        setField(term3841, term3841.getClass(), "jsType", null);
        setField(term3841, term3841.getClass(), "parent", null);
        term22710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22715 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term22716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22718 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term22710, term22710.getClass(), "type", 942412391);
        setIntField(term22711, term22711.getClass(), "type", -1308902065);
        setIntField(term22712, term22712.getClass(), "type", 0);
        setField(term22712, term22712.getClass(), "next", null);
        setField(term22712, term22712.getClass(), "first", null);
        setField(term22712, term22712.getClass(), "last", null);
        setField(term22712, term22712.getClass(), "propListHead", null);
        setIntField(term22712, term22712.getClass(), "sourcePosition", 0);
        setField(term22712, term22712.getClass(), "jsType", null);
        setField(term22712, term22712.getClass(), "parent", null);
        setField(term22711, term22711.getClass(), "next", term22712);
        setIntField(term22713, term22713.getClass(), "type", 0);
        setField(term22713, term22713.getClass(), "next", null);
        setField(term22713, term22713.getClass(), "first", null);
        setField(term22713, term22713.getClass(), "last", null);
        setField(term22713, term22713.getClass(), "propListHead", null);
        setIntField(term22713, term22713.getClass(), "sourcePosition", 0);
        setField(term22713, term22713.getClass(), "jsType", null);
        setField(term22713, term22713.getClass(), "parent", null);
        setField(term22711, term22711.getClass(), "first", term22713);
        setIntField(term22714, term22714.getClass(), "type", 0);
        setField(term22714, term22714.getClass(), "next", null);
        setField(term22714, term22714.getClass(), "first", null);
        setField(term22714, term22714.getClass(), "last", null);
        setField(term22714, term22714.getClass(), "propListHead", null);
        setIntField(term22714, term22714.getClass(), "sourcePosition", 0);
        setField(term22714, term22714.getClass(), "jsType", null);
        setField(term22714, term22714.getClass(), "parent", null);
        setField(term22711, term22711.getClass(), "last", term22714);
        setField(term22715, term22715.getClass(), "next", null);
        setIntField(term22715, term22715.getClass(), "type", 0);
        setIntField(term22715, term22715.getClass(), "intValue", 0);
        setField(term22715, term22715.getClass(), "objectValue", null);
        setField(term22711, term22711.getClass(), "propListHead", term22715);
        setIntField(term22711, term22711.getClass(), "sourcePosition", -1122596893);
        setField(term22711, term22711.getClass(), "jsType", null);
        setField(term22711, term22711.getClass(), "parent", null);
        setField(term22710, term22710.getClass(), "next", term22711);
        setIntField(term22716, term22716.getClass(), "type", 0);
        setField(term22716, term22716.getClass(), "next", null);
        setField(term22716, term22716.getClass(), "first", null);
        setField(term22716, term22716.getClass(), "last", null);
        setField(term22716, term22716.getClass(), "propListHead", null);
        setIntField(term22716, term22716.getClass(), "sourcePosition", 0);
        setField(term22716, term22716.getClass(), "jsType", null);
        setField(term22716, term22716.getClass(), "parent", null);
        setField(term22710, term22710.getClass(), "first", term22716);
        setIntField(term22717, term22717.getClass(), "type", 0);
        setField(term22717, term22717.getClass(), "next", null);
        setField(term22717, term22717.getClass(), "first", null);
        setField(term22717, term22717.getClass(), "last", null);
        setField(term22717, term22717.getClass(), "propListHead", null);
        setIntField(term22717, term22717.getClass(), "sourcePosition", 0);
        setField(term22717, term22717.getClass(), "jsType", null);
        setField(term22717, term22717.getClass(), "parent", null);
        setField(term22710, term22710.getClass(), "last", term22717);
        setField(term22718, term22718.getClass(), "next", null);
        setIntField(term22718, term22718.getClass(), "type", 0);
        setIntField(term22718, term22718.getClass(), "intValue", 0);
        setField(term22718, term22718.getClass(), "objectValue", null);
        setField(term22710, term22710.getClass(), "propListHead", term22718);
        setIntField(term22710, term22710.getClass(), "sourcePosition", -2147297900);
        setField(term22710, term22710.getClass(), "jsType", null);
        setField(term22710, term22710.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3841;
        args[1] = "IoAlmYsBwc";
        Object retValue = callMethod(klass, "getNameReferenceCount", argTypes, null, args);
        assertTrue(recursiveEquals(term3841, "IoAlmYsBwc"));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


