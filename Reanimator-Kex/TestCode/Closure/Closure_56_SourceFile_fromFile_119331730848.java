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
import java.lang.String;
import java.lang.Object;

public class SourceFile_fromFile_119331730848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1448;
     Object term4991;
     Object term4930;

    public SourceFile_fromFile_119331730848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5008 = Class.forName((String) "java.io.File$PathStatus");
        Field term5007 = ((Class) term5008).getDeclaredField((String) "INVALID");
        ((Field) term5007).setAccessible(true);
        Object enum2 = ((Field) term5007).get((Object) null);
        term1448 = newInstance(Class.forName("java.io.File"));
        setField(term1448, term1448.getClass(), "path", "ffYhPOzlUs");
        setField(term1448, term1448.getClass(), "status", enum2);
        setIntField(term1448, term1448.getClass(), "prefixLength", -894662986);
        setField(term1448, term1448.getClass(), "filePath", null);
        Class<? extends Object> term5161 = Class.forName((String) "java.io.File$PathStatus");
        Field term5160 = ((Class) term5161).getDeclaredField((String) "INVALID");
        ((Field) term5160).setAccessible(true);
        Object enum3 = ((Field) term5160).get((Object) null);
        term4991 = newInstance(Class.forName("java.io.File"));
        setField(term4991, term4991.getClass(), "path", "ffYhPOzlUs");
        setField(term4991, term4991.getClass(), "status", enum3);
        setIntField(term4991, term4991.getClass(), "prefixLength", -894662986);
        setField(term4991, term4991.getClass(), "filePath", null);
        Class<? extends Object> term5314 = Class.forName((String) "java.io.File$PathStatus");
        Field term5313 = ((Class) term5314).getDeclaredField((String) "INVALID");
        ((Field) term5313).setAccessible(true);
        Object enum4 = ((Field) term5313).get((Object) null);
        term4930 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        Object term4931 = newInstance(Class.forName("java.io.File"));
        setField(term4931, term4931.getClass(), "path", "ffYhPOzlUs");
        setField(term4931, term4931.getClass(), "status", enum4);
        setIntField(term4931, term4931.getClass(), "prefixLength", -894662986);
        setField(term4931, term4931.getClass(), "filePath", null);
        setField(term4930, term4930.getClass(), "file", term4931);
        setField(term4930, term4930.getClass(), "inputCharset", "UTF-8");
        setField(term4930, term4930.getClass(), "fileName", "ffYhPOzlUs");
        setBooleanField(term4930, term4930.getClass(), "isExternFile", false);
        setField(term4930, term4930.getClass(), "originalPath", null);
        setField(term4930, term4930.getClass(), "lineOffsets", null);
        setIntField(term4930, term4930.getClass(), "lastOffset", 0);
        setIntField(term4930, term4930.getClass(), "lastLine", 1);
        setField(term4930, term4930.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = term1448;
        args[1] = null;
        Object retValue = callMethod(klass, "fromFile", argTypes, null, args);
        assertTrue(recursiveEquals(term1448, term4991));
        assertTrue(recursiveEquals(retValue, term4930));
    }

};


