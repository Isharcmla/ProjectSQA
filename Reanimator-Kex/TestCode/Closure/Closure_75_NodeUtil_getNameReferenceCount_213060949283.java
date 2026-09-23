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
     Object term22757;

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
        term22757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22762 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term22763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22765 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term22757, term22757.getClass(), "type", 942412391);
        setIntField(term22758, term22758.getClass(), "type", -1308902065);
        setIntField(term22759, term22759.getClass(), "type", 0);
        setField(term22759, term22759.getClass(), "next", null);
        setField(term22759, term22759.getClass(), "first", null);
        setField(term22759, term22759.getClass(), "last", null);
        setField(term22759, term22759.getClass(), "propListHead", null);
        setIntField(term22759, term22759.getClass(), "sourcePosition", 0);
        setField(term22759, term22759.getClass(), "jsType", null);
        setField(term22759, term22759.getClass(), "parent", null);
        setField(term22758, term22758.getClass(), "next", term22759);
        setIntField(term22760, term22760.getClass(), "type", 0);
        setField(term22760, term22760.getClass(), "next", null);
        setField(term22760, term22760.getClass(), "first", null);
        setField(term22760, term22760.getClass(), "last", null);
        setField(term22760, term22760.getClass(), "propListHead", null);
        setIntField(term22760, term22760.getClass(), "sourcePosition", 0);
        setField(term22760, term22760.getClass(), "jsType", null);
        setField(term22760, term22760.getClass(), "parent", null);
        setField(term22758, term22758.getClass(), "first", term22760);
        setIntField(term22761, term22761.getClass(), "type", 0);
        setField(term22761, term22761.getClass(), "next", null);
        setField(term22761, term22761.getClass(), "first", null);
        setField(term22761, term22761.getClass(), "last", null);
        setField(term22761, term22761.getClass(), "propListHead", null);
        setIntField(term22761, term22761.getClass(), "sourcePosition", 0);
        setField(term22761, term22761.getClass(), "jsType", null);
        setField(term22761, term22761.getClass(), "parent", null);
        setField(term22758, term22758.getClass(), "last", term22761);
        setField(term22762, term22762.getClass(), "next", null);
        setIntField(term22762, term22762.getClass(), "type", 0);
        setIntField(term22762, term22762.getClass(), "intValue", 0);
        setField(term22762, term22762.getClass(), "objectValue", null);
        setField(term22758, term22758.getClass(), "propListHead", term22762);
        setIntField(term22758, term22758.getClass(), "sourcePosition", -1122596893);
        setField(term22758, term22758.getClass(), "jsType", null);
        setField(term22758, term22758.getClass(), "parent", null);
        setField(term22757, term22757.getClass(), "next", term22758);
        setIntField(term22763, term22763.getClass(), "type", 0);
        setField(term22763, term22763.getClass(), "next", null);
        setField(term22763, term22763.getClass(), "first", null);
        setField(term22763, term22763.getClass(), "last", null);
        setField(term22763, term22763.getClass(), "propListHead", null);
        setIntField(term22763, term22763.getClass(), "sourcePosition", 0);
        setField(term22763, term22763.getClass(), "jsType", null);
        setField(term22763, term22763.getClass(), "parent", null);
        setField(term22757, term22757.getClass(), "first", term22763);
        setIntField(term22764, term22764.getClass(), "type", 0);
        setField(term22764, term22764.getClass(), "next", null);
        setField(term22764, term22764.getClass(), "first", null);
        setField(term22764, term22764.getClass(), "last", null);
        setField(term22764, term22764.getClass(), "propListHead", null);
        setIntField(term22764, term22764.getClass(), "sourcePosition", 0);
        setField(term22764, term22764.getClass(), "jsType", null);
        setField(term22764, term22764.getClass(), "parent", null);
        setField(term22757, term22757.getClass(), "last", term22764);
        setField(term22765, term22765.getClass(), "next", null);
        setIntField(term22765, term22765.getClass(), "type", 0);
        setIntField(term22765, term22765.getClass(), "intValue", 0);
        setField(term22765, term22765.getClass(), "objectValue", null);
        setField(term22757, term22757.getClass(), "propListHead", term22765);
        setIntField(term22757, term22757.getClass(), "sourcePosition", -2147297900);
        setField(term22757, term22757.getClass(), "jsType", null);
        setField(term22757, term22757.getClass(), "parent", null);
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


