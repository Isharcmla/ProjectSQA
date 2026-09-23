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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addList_71041459250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11048;
     Object term11076;
     Object term11103;

    public CodeGenerator_addList_71041459250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11049 = new HashMap();
        Class<? extends Object> term33996 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term33995 = ((Class) term33996).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term33995).setAccessible(true);
        Object enum90 = ((Field) term33995).get((Object) null);
        term11048 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term11048, term11048.getClass(), "escapedJsStrings", term11049);
        setField(term11048, term11048.getClass(), "cc", null);
        setField(term11048, term11048.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term11048, term11048.getClass(), "preferSingleQuotes", true);
        setBooleanField(term11048, term11048.getClass(), "trustedStrings", true);
        setField(term11048, term11048.getClass(), "languageMode", enum90);
        term11076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11076, term11076.getClass(), "type", -1465035361);
        setIntField(term11078, term11078.getClass(), "type", 1090617576);
        setIntField(term11080, term11080.getClass(), "type", -1547384488);
        setIntField(term11082, term11082.getClass(), "type", 1442160736);
        setIntField(term11084, term11084.getClass(), "type", 1114000454);
        setField(term11084, term11084.getClass(), "next", null);
        setField(term11084, term11084.getClass(), "first", null);
        setField(term11084, term11084.getClass(), "last", null);
        setField(term11084, term11084.getClass(), "propListHead", null);
        setIntField(term11084, term11084.getClass(), "sourcePosition", 0);
        setField(term11084, term11084.getClass(), "jsType", null);
        setField(term11084, term11084.getClass(), "parent", null);
        setField(term11082, term11082.getClass(), "next", term11084);
        setIntField(term11087, term11087.getClass(), "type", -556405712);
        setField(term11087, term11087.getClass(), "next", null);
        setField(term11087, term11087.getClass(), "first", null);
        setField(term11087, term11087.getClass(), "last", term11084);
        setField(term11087, term11087.getClass(), "propListHead", null);
        setIntField(term11087, term11087.getClass(), "sourcePosition", 0);
        setField(term11087, term11087.getClass(), "jsType", null);
        setField(term11087, term11087.getClass(), "parent", null);
        setField(term11082, term11082.getClass(), "first", term11087);
        setField(term11082, term11082.getClass(), "last", term11080);
        setField(term11082, term11082.getClass(), "propListHead", null);
        setIntField(term11082, term11082.getClass(), "sourcePosition", 0);
        setField(term11082, term11082.getClass(), "jsType", null);
        setField(term11082, term11082.getClass(), "parent", null);
        setField(term11080, term11080.getClass(), "next", term11082);
        setField(term11080, term11080.getClass(), "first", term11084);
        setIntField(term11091, term11091.getClass(), "type", -1845499264);
        setIntField(term11093, term11093.getClass(), "type", -505439934);
        setField(term11093, term11093.getClass(), "next", null);
        setField(term11093, term11093.getClass(), "first", term11087);
        setField(term11093, term11093.getClass(), "last", term11082);
        setField(term11093, term11093.getClass(), "propListHead", null);
        setIntField(term11093, term11093.getClass(), "sourcePosition", 0);
        setField(term11093, term11093.getClass(), "jsType", null);
        setField(term11093, term11093.getClass(), "parent", null);
        setField(term11091, term11091.getClass(), "next", term11093);
        setField(term11091, term11091.getClass(), "first", term11078);
        setField(term11091, term11091.getClass(), "last", term11078);
        setField(term11091, term11091.getClass(), "propListHead", null);
        setIntField(term11091, term11091.getClass(), "sourcePosition", 0);
        setField(term11091, term11091.getClass(), "jsType", null);
        setField(term11091, term11091.getClass(), "parent", null);
        setField(term11080, term11080.getClass(), "last", term11091);
        setField(term11080, term11080.getClass(), "propListHead", null);
        setIntField(term11080, term11080.getClass(), "sourcePosition", 0);
        setField(term11080, term11080.getClass(), "jsType", null);
        setField(term11080, term11080.getClass(), "parent", null);
        setField(term11078, term11078.getClass(), "next", term11080);
        setIntField(term11098, term11098.getClass(), "type", -344842608);
        setField(term11098, term11098.getClass(), "next", term11091);
        setField(term11098, term11098.getClass(), "first", term11093);
        setField(term11098, term11098.getClass(), "last", term11076);
        setField(term11098, term11098.getClass(), "propListHead", null);
        setIntField(term11098, term11098.getClass(), "sourcePosition", 0);
        setField(term11098, term11098.getClass(), "jsType", null);
        setField(term11098, term11098.getClass(), "parent", null);
        setField(term11078, term11078.getClass(), "first", term11098);
        setField(term11078, term11078.getClass(), "last", term11098);
        setField(term11078, term11078.getClass(), "propListHead", null);
        setIntField(term11078, term11078.getClass(), "sourcePosition", 0);
        setField(term11078, term11078.getClass(), "jsType", null);
        setField(term11078, term11078.getClass(), "parent", null);
        setField(term11076, term11076.getClass(), "next", term11078);
        setField(term11076, term11076.getClass(), "first", term11082);
        setField(term11076, term11076.getClass(), "last", term11084);
        setField(term11076, term11076.getClass(), "propListHead", null);
        setIntField(term11076, term11076.getClass(), "sourcePosition", 0);
        setField(term11076, term11076.getClass(), "jsType", null);
        setField(term11076, term11076.getClass(), "parent", null);
        term11103 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term11076;
        args[1] = term11103;
        try {
            callMethod(klass, "addList", argTypes, term11048, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


