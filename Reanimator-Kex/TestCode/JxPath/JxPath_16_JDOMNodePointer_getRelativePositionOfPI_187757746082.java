package org.apache.commons.jxpath.ri.model.jdom;

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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getRelativePositionOfPI_187757746082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3339;

    public JDOMNodePointer_getRelativePositionOfPI_187757746082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3358 = new HashMap();
        HashMap term3363 = new HashMap();
        HashMap term3369 = new HashMap();
        HashMap term3374 = new HashMap();
        HashMap term3380 = new HashMap();
        HashMap term3385 = new HashMap();
        HashMap term3397 = new HashMap();
        HashMap term3403 = new HashMap();
        HashMap term3408 = new HashMap();
        HashMap term3414 = new HashMap();
        HashMap term3419 = new HashMap();
        term3339 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3340 = newInstance(Class.forName("java.lang.Object"));
        Object term3353 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3354 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3355 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3356 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3393 = newInstance(Class.forName("java.lang.Object"));
        Object term3394 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3395 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3396 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3339, term3339.getClass(), "node", term3340);
        setField(term3339, term3339.getClass(), "id", "UiUYnPrcCi");
        setField(term3356, term3356.getClass(), "parent", null);
        setField(term3356, term3356.getClass(), "namespaceMap", null);
        setField(term3356, term3356.getClass(), "reverseMap", null);
        setField(term3356, term3356.getClass(), "pointer", null);
        setBooleanField(term3356, term3356.getClass(), "sealed", false);
        setField(term3355, term3355.getClass(), "parent", term3356);
        setField(term3355, term3355.getClass(), "namespaceMap", term3358);
        setField(term3355, term3355.getClass(), "reverseMap", term3363);
        setField(term3355, term3355.getClass(), "pointer", null);
        setBooleanField(term3355, term3355.getClass(), "sealed", false);
        setField(term3354, term3354.getClass(), "parent", term3355);
        setField(term3354, term3354.getClass(), "namespaceMap", term3369);
        setField(term3354, term3354.getClass(), "reverseMap", term3374);
        setField(term3354, term3354.getClass(), "pointer", null);
        setBooleanField(term3354, term3354.getClass(), "sealed", false);
        setField(term3353, term3353.getClass(), "parent", term3354);
        setField(term3353, term3353.getClass(), "namespaceMap", term3380);
        setField(term3353, term3353.getClass(), "reverseMap", term3385);
        setField(term3353, term3353.getClass(), "pointer", null);
        setBooleanField(term3353, term3353.getClass(), "sealed", false);
        setField(term3339, term3339.getClass(), "localNamespaceResolver", term3353);
        setIntField(term3339, term3339.getClass(), "index", -1179120542);
        setBooleanField(term3339, term3339.getClass(), "attribute", true);
        setField(term3339, term3339.getClass(), "rootNode", term3393);
        setField(term3396, term3396.getClass(), "parent", null);
        setField(term3396, term3396.getClass(), "namespaceMap", term3397);
        setField(term3396, term3396.getClass(), "reverseMap", null);
        setField(term3396, term3396.getClass(), "pointer", null);
        setBooleanField(term3396, term3396.getClass(), "sealed", false);
        setField(term3395, term3395.getClass(), "parent", term3396);
        setField(term3395, term3395.getClass(), "namespaceMap", term3403);
        setField(term3395, term3395.getClass(), "reverseMap", term3408);
        setField(term3395, term3395.getClass(), "pointer", null);
        setBooleanField(term3395, term3395.getClass(), "sealed", false);
        setField(term3394, term3394.getClass(), "parent", term3395);
        setField(term3394, term3394.getClass(), "namespaceMap", term3414);
        setField(term3394, term3394.getClass(), "reverseMap", term3419);
        setField(term3394, term3394.getClass(), "pointer", null);
        setBooleanField(term3394, term3394.getClass(), "sealed", false);
        setField(term3339, term3339.getClass(), "namespaceResolver", term3394);
        setField(term3339, term3339.getClass(), "parent", null);
        setField(term3339, term3339.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term3339, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


