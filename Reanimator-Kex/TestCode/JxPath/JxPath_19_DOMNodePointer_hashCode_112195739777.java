package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_hashCode_112195739777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3351;

    public DOMNodePointer_hashCode_112195739777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3352 = new HashMap();
        HashMap term3386 = new HashMap();
        HashMap term3391 = new HashMap();
        HashMap term3397 = new HashMap();
        HashMap term3402 = new HashMap();
        HashMap term3408 = new HashMap();
        HashMap term3413 = new HashMap();
        HashMap term3422 = new HashMap();
        HashMap term3427 = new HashMap();
        term3351 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3381 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3382 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3384 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3433 = newInstance(Class.forName("java.lang.Object"));
        setField(term3351, term3351.getClass(), "node", null);
        setField(term3351, term3351.getClass(), "namespaces", term3352);
        setField(term3351, term3351.getClass(), "defaultNamespace", "MAcUBcBckh");
        setField(term3351, term3351.getClass(), "id", "oVgzLbrsFr");
        setField(term3384, term3384.getClass(), "parent", null);
        setField(term3384, term3384.getClass(), "namespaceMap", null);
        setField(term3384, term3384.getClass(), "reverseMap", null);
        setField(term3384, term3384.getClass(), "pointer", null);
        setBooleanField(term3384, term3384.getClass(), "sealed", false);
        setField(term3383, term3383.getClass(), "parent", term3384);
        setField(term3383, term3383.getClass(), "namespaceMap", term3386);
        setField(term3383, term3383.getClass(), "reverseMap", term3391);
        setField(term3383, term3383.getClass(), "pointer", null);
        setBooleanField(term3383, term3383.getClass(), "sealed", false);
        setField(term3382, term3382.getClass(), "parent", term3383);
        setField(term3382, term3382.getClass(), "namespaceMap", term3397);
        setField(term3382, term3382.getClass(), "reverseMap", term3402);
        setField(term3382, term3382.getClass(), "pointer", null);
        setBooleanField(term3382, term3382.getClass(), "sealed", false);
        setField(term3381, term3381.getClass(), "parent", term3382);
        setField(term3381, term3381.getClass(), "namespaceMap", term3408);
        setField(term3381, term3381.getClass(), "reverseMap", term3413);
        setField(term3381, term3381.getClass(), "pointer", null);
        setBooleanField(term3381, term3381.getClass(), "sealed", false);
        setField(term3351, term3351.getClass(), "localNamespaceResolver", term3381);
        setIntField(term3351, term3351.getClass(), "index", -203030934);
        setBooleanField(term3351, term3351.getClass(), "attribute", true);
        setField(term3421, term3421.getClass(), "parent", null);
        setField(term3421, term3421.getClass(), "namespaceMap", term3422);
        setField(term3421, term3421.getClass(), "reverseMap", term3427);
        setField(term3421, term3421.getClass(), "pointer", null);
        setBooleanField(term3421, term3421.getClass(), "sealed", false);
        setField(term3351, term3351.getClass(), "namespaceResolver", term3421);
        setField(term3351, term3351.getClass(), "rootNode", term3433);
        setField(term3351, term3351.getClass(), "parent", null);
        setField(term3351, term3351.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term3351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


