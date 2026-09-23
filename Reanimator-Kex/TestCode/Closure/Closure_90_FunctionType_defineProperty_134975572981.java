package com.google.javascript.rhino.jstype;

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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class FunctionType_defineProperty_134975572981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10954;
     Object term11023;
     Object term11025;

    public FunctionType_defineProperty_134975572981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40505 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term40504 = ((Class) term40505).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term40504).setAccessible(true);
        Object enum105 = ((Field) term40504).get((Object) null);
        term10954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10969 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10979 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10956, term10956.getClass(), "type", -1070592289);
        setIntField(term10958, term10958.getClass(), "type", 1252951645);
        setIntField(term10960, term10960.getClass(), "type", 0);
        setField(term10960, term10960.getClass(), "next", null);
        setField(term10960, term10960.getClass(), "first", null);
        setField(term10960, term10960.getClass(), "last", null);
        setField(term10960, term10960.getClass(), "propListHead", null);
        setIntField(term10960, term10960.getClass(), "sourcePosition", 0);
        setField(term10960, term10960.getClass(), "jsType", null);
        setField(term10960, term10960.getClass(), "parent", null);
        setField(term10958, term10958.getClass(), "next", term10960);
        setIntField(term10963, term10963.getClass(), "type", 0);
        setField(term10963, term10963.getClass(), "next", null);
        setField(term10963, term10963.getClass(), "first", null);
        setField(term10963, term10963.getClass(), "last", null);
        setField(term10963, term10963.getClass(), "propListHead", null);
        setIntField(term10963, term10963.getClass(), "sourcePosition", 0);
        setField(term10963, term10963.getClass(), "jsType", null);
        setField(term10963, term10963.getClass(), "parent", null);
        setField(term10958, term10958.getClass(), "first", term10963);
        setIntField(term10966, term10966.getClass(), "type", 0);
        setField(term10966, term10966.getClass(), "next", null);
        setField(term10966, term10966.getClass(), "first", null);
        setField(term10966, term10966.getClass(), "last", null);
        setField(term10966, term10966.getClass(), "propListHead", null);
        setIntField(term10966, term10966.getClass(), "sourcePosition", 0);
        setField(term10966, term10966.getClass(), "jsType", null);
        setField(term10966, term10966.getClass(), "parent", null);
        setField(term10958, term10958.getClass(), "last", term10966);
        setField(term10969, term10969.getClass(), "next", null);
        setIntField(term10969, term10969.getClass(), "type", 0);
        setIntField(term10969, term10969.getClass(), "intValue", 0);
        setField(term10969, term10969.getClass(), "objectValue", null);
        setField(term10958, term10958.getClass(), "propListHead", term10969);
        setIntField(term10958, term10958.getClass(), "sourcePosition", 574481092);
        setField(term10958, term10958.getClass(), "jsType", null);
        setField(term10958, term10958.getClass(), "parent", null);
        setField(term10956, term10956.getClass(), "next", term10958);
        setIntField(term10973, term10973.getClass(), "type", 0);
        setField(term10973, term10973.getClass(), "next", null);
        setField(term10973, term10973.getClass(), "first", null);
        setField(term10973, term10973.getClass(), "last", null);
        setField(term10973, term10973.getClass(), "propListHead", null);
        setIntField(term10973, term10973.getClass(), "sourcePosition", 0);
        setField(term10973, term10973.getClass(), "jsType", null);
        setField(term10973, term10973.getClass(), "parent", null);
        setField(term10956, term10956.getClass(), "first", term10973);
        setIntField(term10976, term10976.getClass(), "type", 0);
        setField(term10976, term10976.getClass(), "next", null);
        setField(term10976, term10976.getClass(), "first", null);
        setField(term10976, term10976.getClass(), "last", null);
        setField(term10976, term10976.getClass(), "propListHead", null);
        setIntField(term10976, term10976.getClass(), "sourcePosition", 0);
        setField(term10976, term10976.getClass(), "jsType", null);
        setField(term10976, term10976.getClass(), "parent", null);
        setField(term10956, term10956.getClass(), "last", term10976);
        setField(term10979, term10979.getClass(), "next", null);
        setIntField(term10979, term10979.getClass(), "type", 0);
        setIntField(term10979, term10979.getClass(), "intValue", 0);
        setField(term10979, term10979.getClass(), "objectValue", null);
        setField(term10956, term10956.getClass(), "propListHead", term10979);
        setIntField(term10956, term10956.getClass(), "sourcePosition", -310528004);
        setField(term10956, term10956.getClass(), "jsType", null);
        setField(term10956, term10956.getClass(), "parent", null);
        setField(term10955, term10955.getClass(), "parameters", term10956);
        setField(term10955, term10955.getClass(), "returnType", null);
        setBooleanField(term10955, term10955.getClass(), "returnTypeInferred", false);
        setBooleanField(term10955, term10955.getClass(), "resolved", false);
        setField(term10955, term10955.getClass(), "resolveResult", null);
        setField(term10955, term10955.getClass(), "registry", null);
        setField(term10954, term10954.getClass(), "call", term10955);
        setField(term10985, term10985.getClass(), "ownerFunction", null);
        setField(term10985, term10985.getClass(), "className", null);
        setField(term10985, term10985.getClass(), "properties", null);
        setBooleanField(term10985, term10985.getClass(), "nativeType", false);
        setField(term10985, term10985.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term10985, term10985.getClass(), "prettyPrint", false);
        setBooleanField(term10985, term10985.getClass(), "visited", false);
        setField(term10985, term10985.getClass(), "docInfo", null);
        setBooleanField(term10985, term10985.getClass(), "unknown", false);
        setBooleanField(term10985, term10985.getClass(), "resolved", false);
        setField(term10985, term10985.getClass(), "resolveResult", null);
        setField(term10985, term10985.getClass(), "registry", null);
        setField(term10954, term10954.getClass(), "prototype", term10985);
        setField(term10954, term10954.getClass(), "kind", enum105);
        setField(term10954, term10954.getClass(), "typeOfThis", null);
        setField(term10954, term10954.getClass(), "source", null);
        setField(term10954, term10954.getClass(), "implementedInterfaces", null);
        setField(term10954, term10954.getClass(), "subTypes", null);
        setField(term10954, term10954.getClass(), "templateTypeName", null);
        setField(term10954, term10954.getClass(), "className", null);
        setField(term10954, term10954.getClass(), "properties", null);
        setBooleanField(term10954, term10954.getClass(), "nativeType", false);
        setField(term10954, term10954.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term10954, term10954.getClass(), "prettyPrint", false);
        setBooleanField(term10954, term10954.getClass(), "visited", false);
        setField(term10954, term10954.getClass(), "docInfo", null);
        setBooleanField(term10954, term10954.getClass(), "unknown", false);
        setBooleanField(term10954, term10954.getClass(), "resolved", false);
        setField(term10954, term10954.getClass(), "resolveResult", null);
        setField(term10954, term10954.getClass(), "registry", null);
        term11023 = new Boolean(true);
        term11025 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "OEXDRUKcFl";
        args[1] = null;
        args[2] = term11023;
        args[3] = term11025;
        try {
            callMethod(klass, "defineProperty", argTypes, term10954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


