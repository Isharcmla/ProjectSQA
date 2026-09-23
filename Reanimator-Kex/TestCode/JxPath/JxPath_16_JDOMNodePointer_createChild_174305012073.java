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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class JDOMNodePointer_createChild_174305012073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2247;
     Object term2333;
     Object term2370;

    public JDOMNodePointer_createChild_174305012073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2266 = new HashMap();
        HashMap term2271 = new HashMap();
        HashMap term2277 = new HashMap();
        HashMap term2282 = new HashMap();
        HashMap term2288 = new HashMap();
        HashMap term2293 = new HashMap();
        HashMap term2305 = new HashMap();
        HashMap term2311 = new HashMap();
        HashMap term2316 = new HashMap();
        HashMap term2322 = new HashMap();
        HashMap term2327 = new HashMap();
        term2247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2248 = newInstance(Class.forName("java.lang.Object"));
        Object term2261 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2262 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2264 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2301 = newInstance(Class.forName("java.lang.Object"));
        Object term2302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2303 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2304 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2247, term2247.getClass(), "node", term2248);
        setField(term2247, term2247.getClass(), "id", "AijpHYOFuy");
        setField(term2264, term2264.getClass(), "parent", null);
        setField(term2264, term2264.getClass(), "namespaceMap", null);
        setField(term2264, term2264.getClass(), "reverseMap", null);
        setField(term2264, term2264.getClass(), "pointer", null);
        setBooleanField(term2264, term2264.getClass(), "sealed", false);
        setField(term2263, term2263.getClass(), "parent", term2264);
        setField(term2263, term2263.getClass(), "namespaceMap", term2266);
        setField(term2263, term2263.getClass(), "reverseMap", term2271);
        setField(term2263, term2263.getClass(), "pointer", null);
        setBooleanField(term2263, term2263.getClass(), "sealed", false);
        setField(term2262, term2262.getClass(), "parent", term2263);
        setField(term2262, term2262.getClass(), "namespaceMap", term2277);
        setField(term2262, term2262.getClass(), "reverseMap", term2282);
        setField(term2262, term2262.getClass(), "pointer", null);
        setBooleanField(term2262, term2262.getClass(), "sealed", false);
        setField(term2261, term2261.getClass(), "parent", term2262);
        setField(term2261, term2261.getClass(), "namespaceMap", term2288);
        setField(term2261, term2261.getClass(), "reverseMap", term2293);
        setField(term2261, term2261.getClass(), "pointer", null);
        setBooleanField(term2261, term2261.getClass(), "sealed", false);
        setField(term2247, term2247.getClass(), "localNamespaceResolver", term2261);
        setIntField(term2247, term2247.getClass(), "index", -655067527);
        setBooleanField(term2247, term2247.getClass(), "attribute", true);
        setField(term2247, term2247.getClass(), "rootNode", term2301);
        setField(term2304, term2304.getClass(), "parent", null);
        setField(term2304, term2304.getClass(), "namespaceMap", term2305);
        setField(term2304, term2304.getClass(), "reverseMap", null);
        setField(term2304, term2304.getClass(), "pointer", null);
        setBooleanField(term2304, term2304.getClass(), "sealed", false);
        setField(term2303, term2303.getClass(), "parent", term2304);
        setField(term2303, term2303.getClass(), "namespaceMap", term2311);
        setField(term2303, term2303.getClass(), "reverseMap", term2316);
        setField(term2303, term2303.getClass(), "pointer", null);
        setBooleanField(term2303, term2303.getClass(), "sealed", false);
        setField(term2302, term2302.getClass(), "parent", term2303);
        setField(term2302, term2302.getClass(), "namespaceMap", term2322);
        setField(term2302, term2302.getClass(), "reverseMap", term2327);
        setField(term2302, term2302.getClass(), "pointer", null);
        setBooleanField(term2302, term2302.getClass(), "sealed", false);
        setField(term2247, term2247.getClass(), "namespaceResolver", term2302);
        setField(term2247, term2247.getClass(), "parent", null);
        setField(term2247, term2247.getClass(), "locale", null);
        term2333 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2333, term2333.getClass(), "prefix", "SbAoxhfrkn");
        setField(term2333, term2333.getClass(), "name", "kuTXqwMtDB");
        setField(term2333, term2333.getClass(), "qualifiedName", "Ghbwtircqb");
        term2370 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2333;
        args[2] = term2370;
        try {
            callMethod(klass, "createChild", argTypes, term2247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


