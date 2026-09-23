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

public class JDOMNodePointer_createChild_178033812172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2517;
     Object term2608;
     Object term2645;
     Object term2647;

    public JDOMNodePointer_createChild_178033812172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2536 = new HashMap();
        HashMap term2541 = new HashMap();
        HashMap term2547 = new HashMap();
        HashMap term2552 = new HashMap();
        HashMap term2558 = new HashMap();
        HashMap term2563 = new HashMap();
        HashMap term2574 = new HashMap();
        HashMap term2579 = new HashMap();
        HashMap term2585 = new HashMap();
        HashMap term2590 = new HashMap();
        HashMap term2596 = new HashMap();
        HashMap term2601 = new HashMap();
        term2517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2518 = newInstance(Class.forName("java.lang.Object"));
        Object term2531 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2532 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2533 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2534 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2607 = newInstance(Class.forName("java.lang.Object"));
        setField(term2517, term2517.getClass(), "node", term2518);
        setField(term2517, term2517.getClass(), "id", "xrwlQZdwCp");
        setField(term2534, term2534.getClass(), "parent", null);
        setField(term2534, term2534.getClass(), "namespaceMap", null);
        setField(term2534, term2534.getClass(), "reverseMap", null);
        setField(term2534, term2534.getClass(), "pointer", null);
        setBooleanField(term2534, term2534.getClass(), "sealed", false);
        setField(term2533, term2533.getClass(), "parent", term2534);
        setField(term2533, term2533.getClass(), "namespaceMap", term2536);
        setField(term2533, term2533.getClass(), "reverseMap", term2541);
        setField(term2533, term2533.getClass(), "pointer", null);
        setBooleanField(term2533, term2533.getClass(), "sealed", false);
        setField(term2532, term2532.getClass(), "parent", term2533);
        setField(term2532, term2532.getClass(), "namespaceMap", term2547);
        setField(term2532, term2532.getClass(), "reverseMap", term2552);
        setField(term2532, term2532.getClass(), "pointer", null);
        setBooleanField(term2532, term2532.getClass(), "sealed", false);
        setField(term2531, term2531.getClass(), "parent", term2532);
        setField(term2531, term2531.getClass(), "namespaceMap", term2558);
        setField(term2531, term2531.getClass(), "reverseMap", term2563);
        setField(term2531, term2531.getClass(), "pointer", null);
        setBooleanField(term2531, term2531.getClass(), "sealed", false);
        setField(term2517, term2517.getClass(), "localNamespaceResolver", term2531);
        setIntField(term2517, term2517.getClass(), "index", -2068769794);
        setBooleanField(term2517, term2517.getClass(), "attribute", true);
        setField(term2573, term2573.getClass(), "parent", null);
        setField(term2573, term2573.getClass(), "namespaceMap", term2574);
        setField(term2573, term2573.getClass(), "reverseMap", term2579);
        setField(term2573, term2573.getClass(), "pointer", null);
        setBooleanField(term2573, term2573.getClass(), "sealed", false);
        setField(term2572, term2572.getClass(), "parent", term2573);
        setField(term2572, term2572.getClass(), "namespaceMap", term2585);
        setField(term2572, term2572.getClass(), "reverseMap", term2590);
        setField(term2572, term2572.getClass(), "pointer", null);
        setBooleanField(term2572, term2572.getClass(), "sealed", false);
        setField(term2571, term2571.getClass(), "parent", term2572);
        setField(term2571, term2571.getClass(), "namespaceMap", term2596);
        setField(term2571, term2571.getClass(), "reverseMap", term2601);
        setField(term2571, term2571.getClass(), "pointer", null);
        setBooleanField(term2571, term2571.getClass(), "sealed", false);
        setField(term2517, term2517.getClass(), "namespaceResolver", term2571);
        setField(term2517, term2517.getClass(), "rootNode", term2607);
        setField(term2517, term2517.getClass(), "parent", null);
        setField(term2517, term2517.getClass(), "locale", null);
        term2608 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2608, term2608.getClass(), "prefix", "IDCWpPLRkE");
        setField(term2608, term2608.getClass(), "name", "nyiiPDVjAc");
        setField(term2608, term2608.getClass(), "qualifiedName", "aKnKipADSo");
        term2645 = new Integer(-117576464);
        term2647 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2608;
        args[2] = term2645;
        args[3] = term2647;
        try {
            callMethod(klass, "createChild", argTypes, term2517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


