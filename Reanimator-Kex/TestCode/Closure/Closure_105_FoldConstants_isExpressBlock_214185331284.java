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

public class FoldConstants_isExpressBlock_214185331284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4973;
     Object term4974;
     Object term14604;
     Object term14605;

    public FoldConstants_isExpressBlock_214185331284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4973 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term4973, term4973.getClass(), "compiler", null);
        term4974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4987 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4997 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4974, term4974.getClass(), "type", -2077814162);
        setIntField(term4976, term4976.getClass(), "type", 961252909);
        setIntField(term4978, term4978.getClass(), "type", 0);
        setField(term4978, term4978.getClass(), "next", null);
        setField(term4978, term4978.getClass(), "first", null);
        setField(term4978, term4978.getClass(), "last", null);
        setField(term4978, term4978.getClass(), "propListHead", null);
        setIntField(term4978, term4978.getClass(), "sourcePosition", 0);
        setField(term4978, term4978.getClass(), "jsType", null);
        setField(term4978, term4978.getClass(), "parent", null);
        setField(term4976, term4976.getClass(), "next", term4978);
        setIntField(term4981, term4981.getClass(), "type", 0);
        setField(term4981, term4981.getClass(), "next", null);
        setField(term4981, term4981.getClass(), "first", null);
        setField(term4981, term4981.getClass(), "last", null);
        setField(term4981, term4981.getClass(), "propListHead", null);
        setIntField(term4981, term4981.getClass(), "sourcePosition", 0);
        setField(term4981, term4981.getClass(), "jsType", null);
        setField(term4981, term4981.getClass(), "parent", null);
        setField(term4976, term4976.getClass(), "first", term4981);
        setIntField(term4984, term4984.getClass(), "type", 0);
        setField(term4984, term4984.getClass(), "next", null);
        setField(term4984, term4984.getClass(), "first", null);
        setField(term4984, term4984.getClass(), "last", null);
        setField(term4984, term4984.getClass(), "propListHead", null);
        setIntField(term4984, term4984.getClass(), "sourcePosition", 0);
        setField(term4984, term4984.getClass(), "jsType", null);
        setField(term4984, term4984.getClass(), "parent", null);
        setField(term4976, term4976.getClass(), "last", term4984);
        setField(term4987, term4987.getClass(), "next", null);
        setIntField(term4987, term4987.getClass(), "type", 0);
        setIntField(term4987, term4987.getClass(), "intValue", 0);
        setField(term4987, term4987.getClass(), "objectValue", null);
        setField(term4976, term4976.getClass(), "propListHead", term4987);
        setIntField(term4976, term4976.getClass(), "sourcePosition", 923905351);
        setField(term4976, term4976.getClass(), "jsType", null);
        setField(term4976, term4976.getClass(), "parent", null);
        setField(term4974, term4974.getClass(), "next", term4976);
        setIntField(term4991, term4991.getClass(), "type", 0);
        setField(term4991, term4991.getClass(), "next", null);
        setField(term4991, term4991.getClass(), "first", null);
        setField(term4991, term4991.getClass(), "last", null);
        setField(term4991, term4991.getClass(), "propListHead", null);
        setIntField(term4991, term4991.getClass(), "sourcePosition", 0);
        setField(term4991, term4991.getClass(), "jsType", null);
        setField(term4991, term4991.getClass(), "parent", null);
        setField(term4974, term4974.getClass(), "first", term4991);
        setIntField(term4994, term4994.getClass(), "type", 0);
        setField(term4994, term4994.getClass(), "next", null);
        setField(term4994, term4994.getClass(), "first", null);
        setField(term4994, term4994.getClass(), "last", null);
        setField(term4994, term4994.getClass(), "propListHead", null);
        setIntField(term4994, term4994.getClass(), "sourcePosition", 0);
        setField(term4994, term4994.getClass(), "jsType", null);
        setField(term4994, term4994.getClass(), "parent", null);
        setField(term4974, term4974.getClass(), "last", term4994);
        setField(term4997, term4997.getClass(), "next", null);
        setIntField(term4997, term4997.getClass(), "type", 0);
        setIntField(term4997, term4997.getClass(), "intValue", 0);
        setField(term4997, term4997.getClass(), "objectValue", null);
        setField(term4974, term4974.getClass(), "propListHead", term4997);
        setIntField(term4974, term4974.getClass(), "sourcePosition", 428360161);
        setField(term4974, term4974.getClass(), "jsType", null);
        setField(term4974, term4974.getClass(), "parent", null);
        term14604 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term14604, term14604.getClass(), "compiler", null);
        term14605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14610 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14613 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14605, term14605.getClass(), "type", -2077814162);
        setIntField(term14606, term14606.getClass(), "type", 961252909);
        setIntField(term14607, term14607.getClass(), "type", 0);
        setField(term14607, term14607.getClass(), "next", null);
        setField(term14607, term14607.getClass(), "first", null);
        setField(term14607, term14607.getClass(), "last", null);
        setField(term14607, term14607.getClass(), "propListHead", null);
        setIntField(term14607, term14607.getClass(), "sourcePosition", 0);
        setField(term14607, term14607.getClass(), "jsType", null);
        setField(term14607, term14607.getClass(), "parent", null);
        setField(term14606, term14606.getClass(), "next", term14607);
        setIntField(term14608, term14608.getClass(), "type", 0);
        setField(term14608, term14608.getClass(), "next", null);
        setField(term14608, term14608.getClass(), "first", null);
        setField(term14608, term14608.getClass(), "last", null);
        setField(term14608, term14608.getClass(), "propListHead", null);
        setIntField(term14608, term14608.getClass(), "sourcePosition", 0);
        setField(term14608, term14608.getClass(), "jsType", null);
        setField(term14608, term14608.getClass(), "parent", null);
        setField(term14606, term14606.getClass(), "first", term14608);
        setIntField(term14609, term14609.getClass(), "type", 0);
        setField(term14609, term14609.getClass(), "next", null);
        setField(term14609, term14609.getClass(), "first", null);
        setField(term14609, term14609.getClass(), "last", null);
        setField(term14609, term14609.getClass(), "propListHead", null);
        setIntField(term14609, term14609.getClass(), "sourcePosition", 0);
        setField(term14609, term14609.getClass(), "jsType", null);
        setField(term14609, term14609.getClass(), "parent", null);
        setField(term14606, term14606.getClass(), "last", term14609);
        setField(term14610, term14610.getClass(), "next", null);
        setIntField(term14610, term14610.getClass(), "type", 0);
        setIntField(term14610, term14610.getClass(), "intValue", 0);
        setField(term14610, term14610.getClass(), "objectValue", null);
        setField(term14606, term14606.getClass(), "propListHead", term14610);
        setIntField(term14606, term14606.getClass(), "sourcePosition", 923905351);
        setField(term14606, term14606.getClass(), "jsType", null);
        setField(term14606, term14606.getClass(), "parent", null);
        setField(term14605, term14605.getClass(), "next", term14606);
        setIntField(term14611, term14611.getClass(), "type", 0);
        setField(term14611, term14611.getClass(), "next", null);
        setField(term14611, term14611.getClass(), "first", null);
        setField(term14611, term14611.getClass(), "last", null);
        setField(term14611, term14611.getClass(), "propListHead", null);
        setIntField(term14611, term14611.getClass(), "sourcePosition", 0);
        setField(term14611, term14611.getClass(), "jsType", null);
        setField(term14611, term14611.getClass(), "parent", null);
        setField(term14605, term14605.getClass(), "first", term14611);
        setIntField(term14612, term14612.getClass(), "type", 0);
        setField(term14612, term14612.getClass(), "next", null);
        setField(term14612, term14612.getClass(), "first", null);
        setField(term14612, term14612.getClass(), "last", null);
        setField(term14612, term14612.getClass(), "propListHead", null);
        setIntField(term14612, term14612.getClass(), "sourcePosition", 0);
        setField(term14612, term14612.getClass(), "jsType", null);
        setField(term14612, term14612.getClass(), "parent", null);
        setField(term14605, term14605.getClass(), "last", term14612);
        setField(term14613, term14613.getClass(), "next", null);
        setIntField(term14613, term14613.getClass(), "type", 0);
        setIntField(term14613, term14613.getClass(), "intValue", 0);
        setField(term14613, term14613.getClass(), "objectValue", null);
        setField(term14605, term14605.getClass(), "propListHead", term14613);
        setIntField(term14605, term14605.getClass(), "sourcePosition", 428360161);
        setField(term14605, term14605.getClass(), "jsType", null);
        setField(term14605, term14605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4974;
        callMethod(klass, "isExpressBlock", argTypes, term4973, args);
        assertTrue(recursiveEquals(term4973, term14604));
        assertTrue(recursiveEquals(term4974, term14605));
    }

};


