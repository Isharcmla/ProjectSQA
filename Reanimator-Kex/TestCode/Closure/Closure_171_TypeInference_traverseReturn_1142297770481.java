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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419361;
     Object term1419431;

    public TypeInference_traverseReturn_1142297770481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1419361 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1419431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1419501, term1419501.getClass(), "type", 29);
        setIntField(term1419571, term1419571.getClass(), "type", 29);
        setIntField(term1419641, term1419641.getClass(), "type", 29);
        setIntField(term1419711, term1419711.getClass(), "type", 29);
        setIntField(term1419781, term1419781.getClass(), "type", 29);
        setIntField(term1419851, term1419851.getClass(), "type", 29);
        setIntField(term1419921, term1419921.getClass(), "type", 29);
        setIntField(term1419991, term1419991.getClass(), "type", 29);
        setIntField(term1420061, term1420061.getClass(), "type", 29);
        setIntField(term1420131, term1420131.getClass(), "type", 29);
        setIntField(term1420201, term1420201.getClass(), "type", 29);
        setIntField(term1420271, term1420271.getClass(), "type", 29);
        setIntField(term1420341, term1420341.getClass(), "type", 29);
        setIntField(term1420411, term1420411.getClass(), "type", 29);
        setIntField(term1420481, term1420481.getClass(), "type", 29);
        setIntField(term1420551, term1420551.getClass(), "type", 29);
        setIntField(term1420621, term1420621.getClass(), "type", 29);
        setIntField(term1420691, term1420691.getClass(), "type", 29);
        setIntField(term1420761, term1420761.getClass(), "type", 29);
        setIntField(term1420831, term1420831.getClass(), "type", 29);
        setIntField(term1420901, term1420901.getClass(), "type", 29);
        setIntField(term1420971, term1420971.getClass(), "type", 29);
        setIntField(term1421041, term1421041.getClass(), "type", 29);
        setIntField(term1421111, term1421111.getClass(), "type", 29);
        setIntField(term1421181, term1421181.getClass(), "type", 29);
        setIntField(term1421251, term1421251.getClass(), "type", 29);
        setIntField(term1421321, term1421321.getClass(), "type", 29);
        setIntField(term1421391, term1421391.getClass(), "type", 29);
        setIntField(term1421461, term1421461.getClass(), "type", 29);
        setIntField(term1421531, term1421531.getClass(), "type", 29);
        setIntField(term1421601, term1421601.getClass(), "type", 29);
        setIntField(term1421671, term1421671.getClass(), "type", 29);
        setIntField(term1421741, term1421741.getClass(), "type", 29);
        setIntField(term1421811, term1421811.getClass(), "type", 29);
        setIntField(term1421881, term1421881.getClass(), "type", 29);
        setIntField(term1421951, term1421951.getClass(), "type", 29);
        setIntField(term1422021, term1422021.getClass(), "type", 29);
        setIntField(term1422091, term1422091.getClass(), "type", 29);
        setIntField(term1422161, term1422161.getClass(), "type", 29);
        setIntField(term1422231, term1422231.getClass(), "type", 29);
        setIntField(term1422301, term1422301.getClass(), "type", 29);
        setIntField(term1422371, term1422371.getClass(), "type", 29);
        setIntField(term1422441, term1422441.getClass(), "type", 29);
        setIntField(term1422511, term1422511.getClass(), "type", 29);
        setIntField(term1422581, term1422581.getClass(), "type", 153);
        setField(term1422511, term1422511.getClass(), "first", term1422581);
        setField(term1422441, term1422441.getClass(), "first", term1422511);
        setField(term1422371, term1422371.getClass(), "first", term1422441);
        setField(term1422301, term1422301.getClass(), "first", term1422371);
        setField(term1422231, term1422231.getClass(), "first", term1422301);
        setField(term1422161, term1422161.getClass(), "first", term1422231);
        setField(term1422091, term1422091.getClass(), "first", term1422161);
        setField(term1422021, term1422021.getClass(), "first", term1422091);
        setField(term1421951, term1421951.getClass(), "first", term1422021);
        setField(term1421881, term1421881.getClass(), "first", term1421951);
        setField(term1421811, term1421811.getClass(), "first", term1421881);
        setField(term1421741, term1421741.getClass(), "first", term1421811);
        setField(term1421671, term1421671.getClass(), "first", term1421741);
        setField(term1421601, term1421601.getClass(), "first", term1421671);
        setField(term1421531, term1421531.getClass(), "first", term1421601);
        setField(term1421461, term1421461.getClass(), "first", term1421531);
        setField(term1421391, term1421391.getClass(), "first", term1421461);
        setField(term1421321, term1421321.getClass(), "first", term1421391);
        setField(term1421251, term1421251.getClass(), "first", term1421321);
        setField(term1421181, term1421181.getClass(), "first", term1421251);
        setField(term1421111, term1421111.getClass(), "first", term1421181);
        setField(term1421041, term1421041.getClass(), "first", term1421111);
        setField(term1420971, term1420971.getClass(), "first", term1421041);
        setField(term1420901, term1420901.getClass(), "first", term1420971);
        setField(term1420831, term1420831.getClass(), "first", term1420901);
        setField(term1420761, term1420761.getClass(), "first", term1420831);
        setField(term1420691, term1420691.getClass(), "first", term1420761);
        setField(term1420621, term1420621.getClass(), "first", term1420691);
        setField(term1420551, term1420551.getClass(), "first", term1420621);
        setField(term1420481, term1420481.getClass(), "first", term1420551);
        setField(term1420411, term1420411.getClass(), "first", term1420481);
        setField(term1420341, term1420341.getClass(), "first", term1420411);
        setField(term1420271, term1420271.getClass(), "first", term1420341);
        setField(term1420201, term1420201.getClass(), "first", term1420271);
        setField(term1420131, term1420131.getClass(), "first", term1420201);
        setField(term1420061, term1420061.getClass(), "first", term1420131);
        setField(term1419991, term1419991.getClass(), "first", term1420061);
        setField(term1419921, term1419921.getClass(), "first", term1419991);
        setField(term1419851, term1419851.getClass(), "first", term1419921);
        setField(term1419781, term1419781.getClass(), "first", term1419851);
        setField(term1419711, term1419711.getClass(), "first", term1419781);
        setField(term1419641, term1419641.getClass(), "first", term1419711);
        setField(term1419571, term1419571.getClass(), "first", term1419641);
        setField(term1419501, term1419501.getClass(), "first", term1419571);
        setField(term1419431, term1419431.getClass(), "first", term1419501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1419431;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1419361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


