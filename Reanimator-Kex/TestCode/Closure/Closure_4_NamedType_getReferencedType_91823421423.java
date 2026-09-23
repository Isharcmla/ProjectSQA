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
import java.util.ArrayList;
import java.lang.Object;

public class NamedType_getReferencedType_91823421423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864;
     Object term4394;

    public NamedType_getReferencedType_91823421423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term893, term893.getClass(), "propertyName", "");
        setField(term893, term893.getClass(), "type", null);
        setBooleanField(term893, term893.getClass(), "inferred", false);
        setIntField(term896, term896.getClass(), "type", 1193880199);
        setField(term896, term896.getClass(), "next", null);
        setField(term896, term896.getClass(), "first", null);
        setField(term896, term896.getClass(), "last", null);
        setField(term896, term896.getClass(), "propListHead", null);
        setIntField(term896, term896.getClass(), "sourcePosition", 0);
        setField(term896, term896.getClass(), "jsType", null);
        setField(term896, term896.getClass(), "parent", null);
        setField(term893, term893.getClass(), "propertyNode", term896);
        Object term899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term899, term899.getClass(), "propertyName", "");
        setField(term899, term899.getClass(), "type", null);
        setBooleanField(term899, term899.getClass(), "inferred", false);
        setField(term899, term899.getClass(), "propertyNode", null);
        Object term902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term902, term902.getClass(), "propertyName", null);
        setField(term902, term902.getClass(), "type", null);
        setBooleanField(term902, term902.getClass(), "inferred", false);
        setField(term902, term902.getClass(), "propertyNode", null);
        Object term904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term904, term904.getClass(), "propertyName", null);
        setField(term904, term904.getClass(), "type", null);
        setBooleanField(term904, term904.getClass(), "inferred", false);
        setField(term904, term904.getClass(), "propertyNode", null);
        Object term906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term906, term906.getClass(), "propertyName", null);
        setField(term906, term906.getClass(), "type", null);
        setBooleanField(term906, term906.getClass(), "inferred", false);
        setField(term906, term906.getClass(), "propertyNode", null);
        Object term908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term908, term908.getClass(), "propertyName", null);
        setField(term908, term908.getClass(), "type", null);
        setBooleanField(term908, term908.getClass(), "inferred", false);
        setField(term908, term908.getClass(), "propertyNode", null);
        ArrayList term891 = new ArrayList();
        ((ArrayList) term891).add(term893);
        ((ArrayList) term891).add(term899);
        ((ArrayList) term891).add(term902);
        ((ArrayList) term891).add(term904);
        ((ArrayList) term891).add(term906);
        ((ArrayList) term891).add(term908);
        term864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term864, term864.getClass(), "reference", "cAPeiZHKGJ");
        setField(term864, term864.getClass(), "sourceName", "LvJFtLBaxj");
        setIntField(term864, term864.getClass(), "lineno", -73683645);
        setIntField(term864, term864.getClass(), "charno", -226514366);
        setField(term864, term864.getClass(), "validator", null);
        setField(term864, term864.getClass(), "propertyContinuations", term891);
        setField(term864, term864.getClass(), "referencedType", null);
        setField(term864, term864.getClass(), "referencedObjType", null);
        setBooleanField(term864, term864.getClass(), "visited", false);
        setField(term864, term864.getClass(), "docInfo", null);
        setBooleanField(term864, term864.getClass(), "unknown", false);
        setBooleanField(term864, term864.getClass(), "resolved", false);
        setField(term864, term864.getClass(), "resolveResult", null);
        setField(term864, term864.getClass(), "templateKeys", null);
        setField(term864, term864.getClass(), "templatizedTypes", null);
        setBooleanField(term864, term864.getClass(), "inTemplatedCheckVisit", false);
        setField(term864, term864.getClass(), "registry", null);
        Object term4401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term4403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4401, term4401.getClass(), "propertyName", "");
        setField(term4401, term4401.getClass(), "type", null);
        setBooleanField(term4401, term4401.getClass(), "inferred", false);
        setIntField(term4403, term4403.getClass(), "type", 1193880199);
        setField(term4403, term4403.getClass(), "next", null);
        setField(term4403, term4403.getClass(), "first", null);
        setField(term4403, term4403.getClass(), "last", null);
        setField(term4403, term4403.getClass(), "propListHead", null);
        setIntField(term4403, term4403.getClass(), "sourcePosition", 0);
        setField(term4403, term4403.getClass(), "jsType", null);
        setField(term4403, term4403.getClass(), "parent", null);
        setField(term4401, term4401.getClass(), "propertyNode", term4403);
        Object term4404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4404, term4404.getClass(), "propertyName", "");
        setField(term4404, term4404.getClass(), "type", null);
        setBooleanField(term4404, term4404.getClass(), "inferred", false);
        setField(term4404, term4404.getClass(), "propertyNode", null);
        Object term4406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4406, term4406.getClass(), "propertyName", null);
        setField(term4406, term4406.getClass(), "type", null);
        setBooleanField(term4406, term4406.getClass(), "inferred", false);
        setField(term4406, term4406.getClass(), "propertyNode", null);
        Object term4407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4407, term4407.getClass(), "propertyName", null);
        setField(term4407, term4407.getClass(), "type", null);
        setBooleanField(term4407, term4407.getClass(), "inferred", false);
        setField(term4407, term4407.getClass(), "propertyNode", null);
        Object term4408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4408, term4408.getClass(), "propertyName", null);
        setField(term4408, term4408.getClass(), "type", null);
        setBooleanField(term4408, term4408.getClass(), "inferred", false);
        setField(term4408, term4408.getClass(), "propertyNode", null);
        Object term4409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4409, term4409.getClass(), "propertyName", null);
        setField(term4409, term4409.getClass(), "type", null);
        setBooleanField(term4409, term4409.getClass(), "inferred", false);
        setField(term4409, term4409.getClass(), "propertyNode", null);
        ArrayList term4399 = new ArrayList();
        ((ArrayList) term4399).add(term4401);
        ((ArrayList) term4399).add(term4404);
        ((ArrayList) term4399).add(term4406);
        ((ArrayList) term4399).add(term4407);
        ((ArrayList) term4399).add(term4408);
        ((ArrayList) term4399).add(term4409);
        term4394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term4394, term4394.getClass(), "reference", "cAPeiZHKGJ");
        setField(term4394, term4394.getClass(), "sourceName", "LvJFtLBaxj");
        setIntField(term4394, term4394.getClass(), "lineno", -73683645);
        setIntField(term4394, term4394.getClass(), "charno", -226514366);
        setField(term4394, term4394.getClass(), "validator", null);
        setField(term4394, term4394.getClass(), "propertyContinuations", term4399);
        setField(term4394, term4394.getClass(), "referencedType", null);
        setField(term4394, term4394.getClass(), "referencedObjType", null);
        setBooleanField(term4394, term4394.getClass(), "visited", false);
        setField(term4394, term4394.getClass(), "docInfo", null);
        setBooleanField(term4394, term4394.getClass(), "unknown", false);
        setBooleanField(term4394, term4394.getClass(), "resolved", false);
        setField(term4394, term4394.getClass(), "resolveResult", null);
        setField(term4394, term4394.getClass(), "templateKeys", null);
        setField(term4394, term4394.getClass(), "templatizedTypes", null);
        setBooleanField(term4394, term4394.getClass(), "inTemplatedCheckVisit", false);
        setField(term4394, term4394.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReferencedType", argTypes, term864, args);
        assertTrue(recursiveEquals(term864, term4394));
        assertTrue(recursiveEquals(retValue, null));
    }

};


