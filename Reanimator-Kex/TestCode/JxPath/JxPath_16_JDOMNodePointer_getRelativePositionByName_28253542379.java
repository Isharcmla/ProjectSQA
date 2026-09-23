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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getRelativePositionByName_28253542379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3051;
     Object term11331;

    public JDOMNodePointer_getRelativePositionByName_28253542379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3070 = new HashMap();
        HashMap term3075 = new HashMap();
        HashMap term3081 = new HashMap();
        HashMap term3086 = new HashMap();
        HashMap term3092 = new HashMap();
        HashMap term3097 = new HashMap();
        HashMap term3109 = new HashMap();
        HashMap term3115 = new HashMap();
        HashMap term3120 = new HashMap();
        HashMap term3126 = new HashMap();
        HashMap term3131 = new HashMap();
        term3051 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3052 = newInstance(Class.forName("java.lang.Object"));
        Object term3065 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3066 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3068 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3105 = newInstance(Class.forName("java.lang.Object"));
        Object term3106 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3108 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3051, term3051.getClass(), "node", term3052);
        setField(term3051, term3051.getClass(), "id", "xLbjWUgOIL");
        setField(term3068, term3068.getClass(), "parent", null);
        setField(term3068, term3068.getClass(), "namespaceMap", null);
        setField(term3068, term3068.getClass(), "reverseMap", null);
        setField(term3068, term3068.getClass(), "pointer", null);
        setBooleanField(term3068, term3068.getClass(), "sealed", false);
        setField(term3067, term3067.getClass(), "parent", term3068);
        setField(term3067, term3067.getClass(), "namespaceMap", term3070);
        setField(term3067, term3067.getClass(), "reverseMap", term3075);
        setField(term3067, term3067.getClass(), "pointer", null);
        setBooleanField(term3067, term3067.getClass(), "sealed", false);
        setField(term3066, term3066.getClass(), "parent", term3067);
        setField(term3066, term3066.getClass(), "namespaceMap", term3081);
        setField(term3066, term3066.getClass(), "reverseMap", term3086);
        setField(term3066, term3066.getClass(), "pointer", null);
        setBooleanField(term3066, term3066.getClass(), "sealed", false);
        setField(term3065, term3065.getClass(), "parent", term3066);
        setField(term3065, term3065.getClass(), "namespaceMap", term3092);
        setField(term3065, term3065.getClass(), "reverseMap", term3097);
        setField(term3065, term3065.getClass(), "pointer", null);
        setBooleanField(term3065, term3065.getClass(), "sealed", false);
        setField(term3051, term3051.getClass(), "localNamespaceResolver", term3065);
        setIntField(term3051, term3051.getClass(), "index", -1275173084);
        setBooleanField(term3051, term3051.getClass(), "attribute", false);
        setField(term3051, term3051.getClass(), "rootNode", term3105);
        setField(term3108, term3108.getClass(), "parent", null);
        setField(term3108, term3108.getClass(), "namespaceMap", term3109);
        setField(term3108, term3108.getClass(), "reverseMap", null);
        setField(term3108, term3108.getClass(), "pointer", null);
        setBooleanField(term3108, term3108.getClass(), "sealed", false);
        setField(term3107, term3107.getClass(), "parent", term3108);
        setField(term3107, term3107.getClass(), "namespaceMap", term3115);
        setField(term3107, term3107.getClass(), "reverseMap", term3120);
        setField(term3107, term3107.getClass(), "pointer", null);
        setBooleanField(term3107, term3107.getClass(), "sealed", false);
        setField(term3106, term3106.getClass(), "parent", term3107);
        setField(term3106, term3106.getClass(), "namespaceMap", term3126);
        setField(term3106, term3106.getClass(), "reverseMap", term3131);
        setField(term3106, term3106.getClass(), "pointer", null);
        setBooleanField(term3106, term3106.getClass(), "sealed", false);
        setField(term3051, term3051.getClass(), "namespaceResolver", term3106);
        setField(term3051, term3051.getClass(), "parent", null);
        setField(term3051, term3051.getClass(), "locale", null);
        HashMap term11339 = new HashMap();
        HashMap term11340 = new HashMap();
        HashMap term11341 = new HashMap();
        HashMap term11342 = new HashMap();
        HashMap term11343 = new HashMap();
        HashMap term11344 = new HashMap();
        HashMap term11349 = new HashMap();
        HashMap term11350 = new HashMap();
        HashMap term11351 = new HashMap();
        HashMap term11352 = new HashMap();
        HashMap term11353 = new HashMap();
        term11331 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term11332 = newInstance(Class.forName("java.lang.Object"));
        Object term11335 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11336 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11345 = newInstance(Class.forName("java.lang.Object"));
        Object term11346 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11348 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11331, term11331.getClass(), "node", term11332);
        setField(term11331, term11331.getClass(), "id", "xLbjWUgOIL");
        setField(term11338, term11338.getClass(), "parent", null);
        setField(term11338, term11338.getClass(), "namespaceMap", null);
        setField(term11338, term11338.getClass(), "reverseMap", null);
        setField(term11338, term11338.getClass(), "pointer", null);
        setBooleanField(term11338, term11338.getClass(), "sealed", false);
        setField(term11337, term11337.getClass(), "parent", term11338);
        setField(term11337, term11337.getClass(), "namespaceMap", term11339);
        setField(term11337, term11337.getClass(), "reverseMap", term11340);
        setField(term11337, term11337.getClass(), "pointer", null);
        setBooleanField(term11337, term11337.getClass(), "sealed", false);
        setField(term11336, term11336.getClass(), "parent", term11337);
        setField(term11336, term11336.getClass(), "namespaceMap", term11341);
        setField(term11336, term11336.getClass(), "reverseMap", term11342);
        setField(term11336, term11336.getClass(), "pointer", null);
        setBooleanField(term11336, term11336.getClass(), "sealed", false);
        setField(term11335, term11335.getClass(), "parent", term11336);
        setField(term11335, term11335.getClass(), "namespaceMap", term11343);
        setField(term11335, term11335.getClass(), "reverseMap", term11344);
        setField(term11335, term11335.getClass(), "pointer", null);
        setBooleanField(term11335, term11335.getClass(), "sealed", false);
        setField(term11331, term11331.getClass(), "localNamespaceResolver", term11335);
        setIntField(term11331, term11331.getClass(), "index", -1275173084);
        setBooleanField(term11331, term11331.getClass(), "attribute", false);
        setField(term11331, term11331.getClass(), "rootNode", term11345);
        setField(term11348, term11348.getClass(), "parent", null);
        setField(term11348, term11348.getClass(), "namespaceMap", term11349);
        setField(term11348, term11348.getClass(), "reverseMap", null);
        setField(term11348, term11348.getClass(), "pointer", null);
        setBooleanField(term11348, term11348.getClass(), "sealed", false);
        setField(term11347, term11347.getClass(), "parent", term11348);
        setField(term11347, term11347.getClass(), "namespaceMap", term11350);
        setField(term11347, term11347.getClass(), "reverseMap", term11351);
        setField(term11347, term11347.getClass(), "pointer", null);
        setBooleanField(term11347, term11347.getClass(), "sealed", false);
        setField(term11346, term11346.getClass(), "parent", term11347);
        setField(term11346, term11346.getClass(), "namespaceMap", term11352);
        setField(term11346, term11346.getClass(), "reverseMap", term11353);
        setField(term11346, term11346.getClass(), "pointer", null);
        setBooleanField(term11346, term11346.getClass(), "sealed", false);
        setField(term11331, term11331.getClass(), "namespaceResolver", term11346);
        setField(term11331, term11331.getClass(), "parent", null);
        setField(term11331, term11331.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByName", argTypes, term3051, args);
        assertTrue(recursiveEquals(term3051, term11331));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


