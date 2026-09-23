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

public class DOMNodePointer_getRelativePositionOfElement_110568450077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3037;

    public DOMNodePointer_getRelativePositionOfElement_110568450077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3038 = new HashMap();
        HashMap term3072 = new HashMap();
        HashMap term3077 = new HashMap();
        HashMap term3083 = new HashMap();
        HashMap term3088 = new HashMap();
        HashMap term3094 = new HashMap();
        HashMap term3099 = new HashMap();
        HashMap term3109 = new HashMap();
        term3037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3068 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3069 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3070 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3107 = newInstance(Class.forName("java.lang.Object"));
        Object term3108 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3037, term3037.getClass(), "node", null);
        setField(term3037, term3037.getClass(), "namespaces", term3038);
        setField(term3037, term3037.getClass(), "defaultNamespace", "JUmudUmaaV");
        setField(term3037, term3037.getClass(), "id", "KoyGrUJeJW");
        setField(term3070, term3070.getClass(), "parent", null);
        setField(term3070, term3070.getClass(), "namespaceMap", null);
        setField(term3070, term3070.getClass(), "reverseMap", null);
        setField(term3070, term3070.getClass(), "pointer", null);
        setBooleanField(term3070, term3070.getClass(), "sealed", false);
        setField(term3069, term3069.getClass(), "parent", term3070);
        setField(term3069, term3069.getClass(), "namespaceMap", term3072);
        setField(term3069, term3069.getClass(), "reverseMap", term3077);
        setField(term3069, term3069.getClass(), "pointer", null);
        setBooleanField(term3069, term3069.getClass(), "sealed", false);
        setField(term3068, term3068.getClass(), "parent", term3069);
        setField(term3068, term3068.getClass(), "namespaceMap", term3083);
        setField(term3068, term3068.getClass(), "reverseMap", term3088);
        setField(term3068, term3068.getClass(), "pointer", null);
        setBooleanField(term3068, term3068.getClass(), "sealed", false);
        setField(term3067, term3067.getClass(), "parent", term3068);
        setField(term3067, term3067.getClass(), "namespaceMap", term3094);
        setField(term3067, term3067.getClass(), "reverseMap", term3099);
        setField(term3067, term3067.getClass(), "pointer", null);
        setBooleanField(term3067, term3067.getClass(), "sealed", false);
        setField(term3037, term3037.getClass(), "localNamespaceResolver", term3067);
        setIntField(term3037, term3037.getClass(), "index", -1275173084);
        setBooleanField(term3037, term3037.getClass(), "attribute", false);
        setField(term3037, term3037.getClass(), "rootNode", term3107);
        setField(term3108, term3108.getClass(), "parent", null);
        setField(term3108, term3108.getClass(), "namespaceMap", term3109);
        setField(term3108, term3108.getClass(), "reverseMap", null);
        setField(term3108, term3108.getClass(), "pointer", null);
        setBooleanField(term3108, term3108.getClass(), "sealed", false);
        setField(term3037, term3037.getClass(), "namespaceResolver", term3108);
        setField(term3037, term3037.getClass(), "parent", null);
        setField(term3037, term3037.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term3037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


