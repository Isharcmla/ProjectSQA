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
     Object term1257;
     Object term1372;

    public InvocationMatcher_matches_15060654066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1368 = new ArrayList();
        ((ArrayList) term1368).add((Object)null);
        ((ArrayList) term1368).add((Object)null);
        ((ArrayList) term1368).add((Object)null);
        ((ArrayList) term1368).add((Object)null);
        ((ArrayList) term1368).add((Object)null);
        term1257 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1258 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1260 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1261 = (Object[]) newArray("java.lang.Object", 1);
        Object term1262 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1263 = (Object[]) newArray("java.lang.Object", 5);
        Object term1264 = newInstance(Class.forName("java.lang.Object"));
        Object term1265 = newInstance(Class.forName("java.lang.Object"));
        Object term1266 = newInstance(Class.forName("java.lang.Object"));
        Object term1267 = newInstance(Class.forName("java.lang.Object"));
        Object term1268 = newInstance(Class.forName("java.lang.Object"));
        Object term1269 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1367 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1258, term1258.getClass(), "sequenceNumber", -1955890973);
        setField(term1258, term1258.getClass(), "mock", term1260);
        setField(term1258, term1258.getClass(), "method", null);
        setElement(term1261, 0, term1262);
        setField(term1258, term1258.getClass(), "arguments", term1261);
        setElement(term1263, 0, term1264);
        setElement(term1263, 1, term1265);
        setElement(term1263, 2, term1266);
        setElement(term1263, 3, term1267);
        setElement(term1263, 4, term1268);
        setField(term1258, term1258.getClass(), "rawArguments", term1263);
        setField(term1269, term1269.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1258, term1258.getClass(), "location", term1269);
        setBooleanField(term1258, term1258.getClass(), "verified", true);
        setField(term1258, term1258.getClass(), "realMethod", null);
        setField(term1367, term1367.getClass(), "stubbedAt", null);
        setField(term1258, term1258.getClass(), "stubInfo", term1367);
        setField(term1257, term1257.getClass(), "invocation", term1258);
        setField(term1257, term1257.getClass(), "matchers", term1368);
        term1372 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1374 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1375 = (Object[]) newArray("java.lang.Object", 4);
        Object term1376 = newInstance(Class.forName("java.lang.Object"));
        Object term1377 = newInstance(Class.forName("java.lang.Object"));
        Object term1378 = newInstance(Class.forName("java.lang.Object"));
        Object term1379 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1380 = (Object[]) newArray("java.lang.Object", 1);
        Object term1381 = newInstance(Class.forName("java.lang.Object"));
        Object term1382 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1480 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1372, term1372.getClass(), "sequenceNumber", -2038273078);
        setField(term1372, term1372.getClass(), "mock", term1374);
        setField(term1372, term1372.getClass(), "method", null);
        setElement(term1375, 0, term1376);
        setElement(term1375, 1, term1377);
        setElement(term1375, 2, term1378);
        setElement(term1375, 3, term1379);
        setField(term1372, term1372.getClass(), "arguments", term1375);
        setElement(term1380, 0, term1381);
        setField(term1372, term1372.getClass(), "rawArguments", term1380);
        setField(term1382, term1382.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1372, term1372.getClass(), "location", term1382);
        setBooleanField(term1372, term1372.getClass(), "verified", true);
        setField(term1372, term1372.getClass(), "realMethod", null);
        setField(term1480, term1480.getClass(), "stubbedAt", null);
        setField(term1372, term1372.getClass(), "stubInfo", term1480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term1372;
        callMethod(klass, "matches", argTypes, term1257, args);
    }

};


