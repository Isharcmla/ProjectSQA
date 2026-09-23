package org.mockito.internal.invocation;

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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_matches_15060654066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1263;
     Object term1379;

    public InvocationMatcher_matches_15060654066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1375 = new ArrayList();
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        term1263 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1264 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1266 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1267 = (Object[]) newArray("java.lang.Object", 1);
        Object term1268 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1269 = (Object[]) newArray("java.lang.Object", 5);
        Object term1270 = newInstance(Class.forName("java.lang.Object"));
        Object term1271 = newInstance(Class.forName("java.lang.Object"));
        Object term1272 = newInstance(Class.forName("java.lang.Object"));
        Object term1273 = newInstance(Class.forName("java.lang.Object"));
        Object term1274 = newInstance(Class.forName("java.lang.Object"));
        Object term1275 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1374 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1264, term1264.getClass(), "sequenceNumber", -1955890973);
        setField(term1264, term1264.getClass(), "mock", term1266);
        setField(term1264, term1264.getClass(), "method", null);
        setElement(term1267, 0, term1268);
        setField(term1264, term1264.getClass(), "arguments", term1267);
        setElement(term1269, 0, term1270);
        setElement(term1269, 1, term1271);
        setElement(term1269, 2, term1272);
        setElement(term1269, 3, term1273);
        setElement(term1269, 4, term1274);
        setField(term1264, term1264.getClass(), "rawArguments", term1269);
        setField(term1275, term1275.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1264, term1264.getClass(), "location", term1275);
        setBooleanField(term1264, term1264.getClass(), "verified", false);
        setBooleanField(term1264, term1264.getClass(), "verifiedInOrder", true);
        setField(term1264, term1264.getClass(), "realMethod", null);
        setField(term1374, term1374.getClass(), "stubbedAt", null);
        setField(term1264, term1264.getClass(), "stubInfo", term1374);
        setField(term1263, term1263.getClass(), "invocation", term1264);
        setField(term1263, term1263.getClass(), "matchers", term1375);
        term1379 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1381 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1382 = (Object[]) newArray("java.lang.Object", 4);
        Object term1383 = newInstance(Class.forName("java.lang.Object"));
        Object term1384 = newInstance(Class.forName("java.lang.Object"));
        Object term1385 = newInstance(Class.forName("java.lang.Object"));
        Object term1386 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1387 = (Object[]) newArray("java.lang.Object", 1);
        Object term1388 = newInstance(Class.forName("java.lang.Object"));
        Object term1389 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1488 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1379, term1379.getClass(), "sequenceNumber", -2038273078);
        setField(term1379, term1379.getClass(), "mock", term1381);
        setField(term1379, term1379.getClass(), "method", null);
        setElement(term1382, 0, term1383);
        setElement(term1382, 1, term1384);
        setElement(term1382, 2, term1385);
        setElement(term1382, 3, term1386);
        setField(term1379, term1379.getClass(), "arguments", term1382);
        setElement(term1387, 0, term1388);
        setField(term1379, term1379.getClass(), "rawArguments", term1387);
        setField(term1389, term1389.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1379, term1379.getClass(), "location", term1389);
        setBooleanField(term1379, term1379.getClass(), "verified", false);
        setBooleanField(term1379, term1379.getClass(), "verifiedInOrder", false);
        setField(term1379, term1379.getClass(), "realMethod", null);
        setField(term1488, term1488.getClass(), "stubbedAt", null);
        setField(term1379, term1379.getClass(), "stubInfo", term1488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term1379;
        callMethod(klass, "matches", argTypes, term1263, args);
    }

};


