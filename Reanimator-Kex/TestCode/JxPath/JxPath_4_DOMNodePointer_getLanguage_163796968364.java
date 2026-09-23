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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getLanguage_163796968364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1694;
     Object term7856;

    public DOMNodePointer_getLanguage_163796968364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1695 = new HashMap();
        HashMap term1732 = new HashMap();
        HashMap term1737 = new HashMap();
        HashMap term1743 = new HashMap();
        HashMap term1748 = new HashMap();
        HashMap term1754 = new HashMap();
        HashMap term1759 = new HashMap();
        term1694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1726 = newInstance(Class.forName("java.lang.Object"));
        Object term1727 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1729 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1694, term1694.getClass(), "node", null);
        setField(term1694, term1694.getClass(), "namespaces", term1695);
        setField(term1694, term1694.getClass(), "defaultNamespace", "UlajhuVLaP");
        setField(term1694, term1694.getClass(), "id", "gGSMzuGICf");
        setIntField(term1694, term1694.getClass(), "index", -1685132342);
        setBooleanField(term1694, term1694.getClass(), "attribute", true);
        setField(term1694, term1694.getClass(), "rootNode", term1726);
        setField(term1730, term1730.getClass(), "parent", null);
        setField(term1730, term1730.getClass(), "namespaceMap", null);
        setField(term1730, term1730.getClass(), "reverseMap", null);
        setField(term1730, term1730.getClass(), "pointer", null);
        setField(term1730, term1730.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1730, term1730.getClass(), "sealed", false);
        setField(term1729, term1729.getClass(), "parent", term1730);
        setField(term1729, term1729.getClass(), "namespaceMap", term1732);
        setField(term1729, term1729.getClass(), "reverseMap", term1737);
        setField(term1729, term1729.getClass(), "pointer", null);
        setField(term1729, term1729.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1729, term1729.getClass(), "sealed", false);
        setField(term1728, term1728.getClass(), "parent", term1729);
        setField(term1728, term1728.getClass(), "namespaceMap", term1743);
        setField(term1728, term1728.getClass(), "reverseMap", term1748);
        setField(term1728, term1728.getClass(), "pointer", null);
        setField(term1728, term1728.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1728, term1728.getClass(), "sealed", false);
        setField(term1727, term1727.getClass(), "parent", term1728);
        setField(term1727, term1727.getClass(), "namespaceMap", term1754);
        setField(term1727, term1727.getClass(), "reverseMap", term1759);
        setField(term1727, term1727.getClass(), "pointer", null);
        setField(term1727, term1727.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1727, term1727.getClass(), "sealed", false);
        setField(term1694, term1694.getClass(), "namespaceResolver", term1727);
        setField(term1694, term1694.getClass(), "parent", null);
        setField(term1694, term1694.getClass(), "locale", null);
        HashMap term7857 = new HashMap();
        HashMap term7867 = new HashMap();
        HashMap term7868 = new HashMap();
        HashMap term7869 = new HashMap();
        HashMap term7870 = new HashMap();
        HashMap term7871 = new HashMap();
        HashMap term7872 = new HashMap();
        term7856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7862 = newInstance(Class.forName("java.lang.Object"));
        Object term7863 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7864 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7866 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7856, term7856.getClass(), "node", null);
        setField(term7856, term7856.getClass(), "namespaces", term7857);
        setField(term7856, term7856.getClass(), "defaultNamespace", "UlajhuVLaP");
        setField(term7856, term7856.getClass(), "id", "gGSMzuGICf");
        setIntField(term7856, term7856.getClass(), "index", -1685132342);
        setBooleanField(term7856, term7856.getClass(), "attribute", true);
        setField(term7856, term7856.getClass(), "rootNode", term7862);
        setField(term7866, term7866.getClass(), "parent", null);
        setField(term7866, term7866.getClass(), "namespaceMap", null);
        setField(term7866, term7866.getClass(), "reverseMap", null);
        setField(term7866, term7866.getClass(), "pointer", null);
        setField(term7866, term7866.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7866, term7866.getClass(), "sealed", false);
        setField(term7865, term7865.getClass(), "parent", term7866);
        setField(term7865, term7865.getClass(), "namespaceMap", term7867);
        setField(term7865, term7865.getClass(), "reverseMap", term7868);
        setField(term7865, term7865.getClass(), "pointer", null);
        setField(term7865, term7865.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7865, term7865.getClass(), "sealed", false);
        setField(term7864, term7864.getClass(), "parent", term7865);
        setField(term7864, term7864.getClass(), "namespaceMap", term7869);
        setField(term7864, term7864.getClass(), "reverseMap", term7870);
        setField(term7864, term7864.getClass(), "pointer", null);
        setField(term7864, term7864.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7864, term7864.getClass(), "sealed", false);
        setField(term7863, term7863.getClass(), "parent", term7864);
        setField(term7863, term7863.getClass(), "namespaceMap", term7871);
        setField(term7863, term7863.getClass(), "reverseMap", term7872);
        setField(term7863, term7863.getClass(), "pointer", null);
        setField(term7863, term7863.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7863, term7863.getClass(), "sealed", false);
        setField(term7856, term7856.getClass(), "namespaceResolver", term7863);
        setField(term7856, term7856.getClass(), "parent", null);
        setField(term7856, term7856.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term1694, args);
        assertTrue(recursiveEquals(term1694, term7856));
        assertTrue(recursiveEquals(retValue, null));
    }

};


