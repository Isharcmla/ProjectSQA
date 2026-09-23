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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835602;
     Object term836200;
     Object term837691;
     Object term837700;

    public FunctionType_isSubtype_2101002158825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term837710 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term837709 = ((Class) term837710).getDeclaredField((String) "ORDINARY");
        ((Field) term837709).setAccessible(true);
        Object enum1560 = ((Field) term837709).get((Object) null);
        Class<? extends Object> term838001 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term838000 = ((Class) term838001).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term838000).setAccessible(true);
        Object enum1561 = ((Field) term838000).get((Object) null);
        term835602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term835850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term836092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term835602, term835602.getClass(), "kind", enum1560);
        setField(term835850, term835850.getClass(), "kind", enum1561);
        setField(term835602, term835602.getClass(), "typeOfThis", term835850);
        setField(term835602, term835602.getClass(), "call", term836092);
        Class<? extends Object> term838301 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term838300 = ((Class) term838301).getDeclaredField((String) "INTERFACE");
        ((Field) term838300).setAccessible(true);
        Object enum1562 = ((Field) term838300).get((Object) null);
        term836200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term836382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term836200, term836200.getClass(), "kind", enum1561);
        setField(term836382, term836382.getClass(), "kind", enum1562);
        setField(term836200, term836200.getClass(), "typeOfThis", term836382);
        setField(term836200, term836200.getClass(), "call", null);
        Class<? extends Object> term838595 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term838594 = ((Class) term838595).getDeclaredField((String) "ORDINARY");
        ((Field) term838594).setAccessible(true);
        Object enum1563 = ((Field) term838594).get((Object) null);
        Class<? extends Object> term838886 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term838885 = ((Class) term838886).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term838885).setAccessible(true);
        Object enum1564 = ((Field) term838885).get((Object) null);
        term837691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term837692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term837696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term837691, term837691.getClass(), "this$0", null);
        setField(term837692, term837692.getClass(), "parameters", null);
        setField(term837692, term837692.getClass(), "returnType", null);
        setBooleanField(term837692, term837692.getClass(), "resolved", false);
        setField(term837692, term837692.getClass(), "resolveResult", null);
        setField(term837692, term837692.getClass(), "registry", null);
        setField(term837691, term837691.getClass(), "call", term837692);
        setField(term837691, term837691.getClass(), "prototype", null);
        setField(term837691, term837691.getClass(), "kind", enum1563);
        setField(term837696, term837696.getClass(), "call", null);
        setField(term837696, term837696.getClass(), "prototype", null);
        setField(term837696, term837696.getClass(), "kind", enum1564);
        setField(term837696, term837696.getClass(), "typeOfThis", null);
        setField(term837696, term837696.getClass(), "source", null);
        setField(term837696, term837696.getClass(), "implementedInterfaces", null);
        setField(term837696, term837696.getClass(), "subTypes", null);
        setField(term837696, term837696.getClass(), "templateTypeName", null);
        setField(term837696, term837696.getClass(), "className", null);
        setField(term837696, term837696.getClass(), "properties", null);
        setField(term837696, term837696.getClass(), "implicitPrototype", null);
        setBooleanField(term837696, term837696.getClass(), "nativeType", false);
        setBooleanField(term837696, term837696.getClass(), "visited", false);
        setField(term837696, term837696.getClass(), "docInfo", null);
        setBooleanField(term837696, term837696.getClass(), "unknown", false);
        setBooleanField(term837696, term837696.getClass(), "resolved", false);
        setField(term837696, term837696.getClass(), "resolveResult", null);
        setField(term837696, term837696.getClass(), "registry", null);
        setField(term837691, term837691.getClass(), "typeOfThis", term837696);
        setField(term837691, term837691.getClass(), "source", null);
        setField(term837691, term837691.getClass(), "implementedInterfaces", null);
        setField(term837691, term837691.getClass(), "subTypes", null);
        setField(term837691, term837691.getClass(), "templateTypeName", null);
        setField(term837691, term837691.getClass(), "className", null);
        setField(term837691, term837691.getClass(), "properties", null);
        setField(term837691, term837691.getClass(), "implicitPrototype", null);
        setBooleanField(term837691, term837691.getClass(), "nativeType", false);
        setBooleanField(term837691, term837691.getClass(), "visited", false);
        setField(term837691, term837691.getClass(), "docInfo", null);
        setBooleanField(term837691, term837691.getClass(), "unknown", false);
        setBooleanField(term837691, term837691.getClass(), "resolved", false);
        setField(term837691, term837691.getClass(), "resolveResult", null);
        setField(term837691, term837691.getClass(), "registry", null);
        Class<? extends Object> term839186 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term839185 = ((Class) term839186).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term839185).setAccessible(true);
        Object enum1565 = ((Field) term839185).get((Object) null);
        Class<? extends Object> term839486 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term839485 = ((Class) term839486).getDeclaredField((String) "INTERFACE");
        ((Field) term839485).setAccessible(true);
        Object enum1566 = ((Field) term839485).get((Object) null);
        term837700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term837704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term837700, term837700.getClass(), "this$0", null);
        setField(term837700, term837700.getClass(), "call", null);
        setField(term837700, term837700.getClass(), "prototype", null);
        setField(term837700, term837700.getClass(), "kind", enum1565);
        setField(term837704, term837704.getClass(), "this$0", null);
        setField(term837704, term837704.getClass(), "call", null);
        setField(term837704, term837704.getClass(), "prototype", null);
        setField(term837704, term837704.getClass(), "kind", enum1566);
        setField(term837704, term837704.getClass(), "typeOfThis", null);
        setField(term837704, term837704.getClass(), "source", null);
        setField(term837704, term837704.getClass(), "implementedInterfaces", null);
        setField(term837704, term837704.getClass(), "subTypes", null);
        setField(term837704, term837704.getClass(), "templateTypeName", null);
        setField(term837704, term837704.getClass(), "className", null);
        setField(term837704, term837704.getClass(), "properties", null);
        setField(term837704, term837704.getClass(), "implicitPrototype", null);
        setBooleanField(term837704, term837704.getClass(), "nativeType", false);
        setBooleanField(term837704, term837704.getClass(), "visited", false);
        setField(term837704, term837704.getClass(), "docInfo", null);
        setBooleanField(term837704, term837704.getClass(), "unknown", false);
        setBooleanField(term837704, term837704.getClass(), "resolved", false);
        setField(term837704, term837704.getClass(), "resolveResult", null);
        setField(term837704, term837704.getClass(), "registry", null);
        setField(term837700, term837700.getClass(), "typeOfThis", term837704);
        setField(term837700, term837700.getClass(), "source", null);
        setField(term837700, term837700.getClass(), "implementedInterfaces", null);
        setField(term837700, term837700.getClass(), "subTypes", null);
        setField(term837700, term837700.getClass(), "templateTypeName", null);
        setField(term837700, term837700.getClass(), "className", null);
        setField(term837700, term837700.getClass(), "properties", null);
        setField(term837700, term837700.getClass(), "implicitPrototype", null);
        setBooleanField(term837700, term837700.getClass(), "nativeType", false);
        setBooleanField(term837700, term837700.getClass(), "visited", false);
        setField(term837700, term837700.getClass(), "docInfo", null);
        setBooleanField(term837700, term837700.getClass(), "unknown", false);
        setBooleanField(term837700, term837700.getClass(), "resolved", false);
        setField(term837700, term837700.getClass(), "resolveResult", null);
        setField(term837700, term837700.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term836200;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term835602, args);
        assertTrue(recursiveEquals(term835602, term837691));
        assertTrue(recursiveEquals(term836200, term837700));
        assertTrue(recursiveEquals(retValue, false));
    }

};


