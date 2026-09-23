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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addNonEmptyStatement_42379450546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8926;
     Object term8954;
     Object enum85;
     Object term8990;

    public CodeGenerator_addNonEmptyStatement_42379450546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8927 = new HashMap();
        Class<? extends Object> term31167 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term31166 = ((Class) term31167).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term31166).setAccessible(true);
        Object enum84 = ((Field) term31166).get((Object) null);
        term8926 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term8926, term8926.getClass(), "escapedJsStrings", term8927);
        setField(term8926, term8926.getClass(), "cc", null);
        setField(term8926, term8926.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term8926, term8926.getClass(), "preferSingleQuotes", true);
        setBooleanField(term8926, term8926.getClass(), "trustedStrings", true);
        setField(term8926, term8926.getClass(), "languageMode", enum84);
        term8954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8954, term8954.getClass(), "type", -157887805);
        setIntField(term8956, term8956.getClass(), "type", 1876565163);
        setIntField(term8958, term8958.getClass(), "type", -817164822);
        setIntField(term8960, term8960.getClass(), "type", -1016503459);
        setIntField(term8962, term8962.getClass(), "type", -1968847291);
        setField(term8962, term8962.getClass(), "next", null);
        setField(term8962, term8962.getClass(), "first", null);
        setField(term8962, term8962.getClass(), "last", null);
        setField(term8962, term8962.getClass(), "propListHead", null);
        setIntField(term8962, term8962.getClass(), "sourcePosition", 0);
        setField(term8962, term8962.getClass(), "jsType", null);
        setField(term8962, term8962.getClass(), "parent", null);
        setField(term8960, term8960.getClass(), "next", term8962);
        setIntField(term8965, term8965.getClass(), "type", 579005622);
        setField(term8965, term8965.getClass(), "next", null);
        setField(term8965, term8965.getClass(), "first", null);
        setField(term8965, term8965.getClass(), "last", term8962);
        setField(term8965, term8965.getClass(), "propListHead", null);
        setIntField(term8965, term8965.getClass(), "sourcePosition", 0);
        setField(term8965, term8965.getClass(), "jsType", null);
        setField(term8965, term8965.getClass(), "parent", null);
        setField(term8960, term8960.getClass(), "first", term8965);
        setField(term8960, term8960.getClass(), "last", term8958);
        setField(term8960, term8960.getClass(), "propListHead", null);
        setIntField(term8960, term8960.getClass(), "sourcePosition", 0);
        setField(term8960, term8960.getClass(), "jsType", null);
        setField(term8960, term8960.getClass(), "parent", null);
        setField(term8958, term8958.getClass(), "next", term8960);
        setField(term8958, term8958.getClass(), "first", term8962);
        setIntField(term8969, term8969.getClass(), "type", 1632125673);
        setIntField(term8971, term8971.getClass(), "type", 454281060);
        setField(term8971, term8971.getClass(), "next", null);
        setField(term8971, term8971.getClass(), "first", term8965);
        setField(term8971, term8971.getClass(), "last", term8960);
        setField(term8971, term8971.getClass(), "propListHead", null);
        setIntField(term8971, term8971.getClass(), "sourcePosition", 0);
        setField(term8971, term8971.getClass(), "jsType", null);
        setField(term8971, term8971.getClass(), "parent", null);
        setField(term8969, term8969.getClass(), "next", term8971);
        setField(term8969, term8969.getClass(), "first", term8956);
        setField(term8969, term8969.getClass(), "last", term8956);
        setField(term8969, term8969.getClass(), "propListHead", null);
        setIntField(term8969, term8969.getClass(), "sourcePosition", 0);
        setField(term8969, term8969.getClass(), "jsType", null);
        setField(term8969, term8969.getClass(), "parent", null);
        setField(term8958, term8958.getClass(), "last", term8969);
        setField(term8958, term8958.getClass(), "propListHead", null);
        setIntField(term8958, term8958.getClass(), "sourcePosition", 0);
        setField(term8958, term8958.getClass(), "jsType", null);
        setField(term8958, term8958.getClass(), "parent", null);
        setField(term8956, term8956.getClass(), "next", term8958);
        setIntField(term8976, term8976.getClass(), "type", -1786399638);
        setField(term8976, term8976.getClass(), "next", term8969);
        setField(term8976, term8976.getClass(), "first", term8971);
        setField(term8976, term8976.getClass(), "last", term8954);
        setField(term8976, term8976.getClass(), "propListHead", null);
        setIntField(term8976, term8976.getClass(), "sourcePosition", 0);
        setField(term8976, term8976.getClass(), "jsType", null);
        setField(term8976, term8976.getClass(), "parent", null);
        setField(term8956, term8956.getClass(), "first", term8976);
        setField(term8956, term8956.getClass(), "last", term8976);
        setField(term8956, term8956.getClass(), "propListHead", null);
        setIntField(term8956, term8956.getClass(), "sourcePosition", 0);
        setField(term8956, term8956.getClass(), "jsType", null);
        setField(term8956, term8956.getClass(), "parent", null);
        setField(term8954, term8954.getClass(), "next", term8956);
        setField(term8954, term8954.getClass(), "first", term8960);
        setField(term8954, term8954.getClass(), "last", term8962);
        setField(term8954, term8954.getClass(), "propListHead", null);
        setIntField(term8954, term8954.getClass(), "sourcePosition", 0);
        setField(term8954, term8954.getClass(), "jsType", null);
        setField(term8954, term8954.getClass(), "parent", null);
        Class<? extends Object> term31492 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term31491 = ((Class) term31492).getDeclaredField((String) "OTHER");
        ((Field) term31491).setAccessible(true);
        enum85 = ((Field) term31491).get((Object) null);
        term8990 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term8954;
        args[1] = enum85;
        args[2] = term8990;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term8926, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


