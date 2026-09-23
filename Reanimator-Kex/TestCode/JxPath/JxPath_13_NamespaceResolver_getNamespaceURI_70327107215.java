package org.apache.commons.jxpath.ri;

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
import static org.apache.commons.jxpath.ri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class NamespaceResolver_getNamespaceURI_70327107215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public NamespaceResolver_getNamespaceURI_70327107215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term251 = new HashMap();
        HashMap term256 = new HashMap();
        HashMap term262 = new HashMap();
        HashMap term267 = new HashMap();
        HashMap term273 = new HashMap();
        HashMap term278 = new HashMap();
        HashMap term284 = new HashMap();
        HashMap term289 = new HashMap();
        term245 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term248 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term249, term249.getClass(), "parent", null);
        setField(term249, term249.getClass(), "namespaceMap", null);
        setField(term249, term249.getClass(), "reverseMap", null);
        setField(term249, term249.getClass(), "pointer", null);
        setBooleanField(term249, term249.getClass(), "sealed", false);
        setField(term248, term248.getClass(), "parent", term249);
        setField(term248, term248.getClass(), "namespaceMap", term251);
        setField(term248, term248.getClass(), "reverseMap", term256);
        setField(term248, term248.getClass(), "pointer", null);
        setBooleanField(term248, term248.getClass(), "sealed", false);
        setField(term247, term247.getClass(), "parent", term248);
        setField(term247, term247.getClass(), "namespaceMap", term262);
        setField(term247, term247.getClass(), "reverseMap", term267);
        setField(term247, term247.getClass(), "pointer", null);
        setBooleanField(term247, term247.getClass(), "sealed", false);
        setField(term246, term246.getClass(), "parent", term247);
        setField(term246, term246.getClass(), "namespaceMap", term273);
        setField(term246, term246.getClass(), "reverseMap", term278);
        setField(term246, term246.getClass(), "pointer", null);
        setBooleanField(term246, term246.getClass(), "sealed", false);
        setField(term245, term245.getClass(), "parent", term246);
        setField(term245, term245.getClass(), "namespaceMap", term284);
        setField(term245, term245.getClass(), "reverseMap", term289);
        setField(term245, term245.getClass(), "pointer", null);
        setBooleanField(term245, term245.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        try {
            callMethod(klass, "getNamespaceURI", argTypes, term245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


