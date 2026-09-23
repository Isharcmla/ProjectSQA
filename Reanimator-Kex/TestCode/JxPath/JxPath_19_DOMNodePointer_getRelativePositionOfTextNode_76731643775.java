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

public class DOMNodePointer_getRelativePositionOfTextNode_76731643775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3145;

    public DOMNodePointer_getRelativePositionOfTextNode_76731643775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3146 = new HashMap();
        HashMap term3180 = new HashMap();
        HashMap term3185 = new HashMap();
        HashMap term3191 = new HashMap();
        HashMap term3196 = new HashMap();
        HashMap term3202 = new HashMap();
        HashMap term3207 = new HashMap();
        HashMap term3216 = new HashMap();
        HashMap term3221 = new HashMap();
        term3145 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3176 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3215 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3227 = newInstance(Class.forName("java.lang.Object"));
        setField(term3145, term3145.getClass(), "node", null);
        setField(term3145, term3145.getClass(), "namespaces", term3146);
        setField(term3145, term3145.getClass(), "defaultNamespace", "IgRJUzaCwW");
        setField(term3145, term3145.getClass(), "id", "JUmudUmaaV");
        setField(term3178, term3178.getClass(), "parent", null);
        setField(term3178, term3178.getClass(), "namespaceMap", null);
        setField(term3178, term3178.getClass(), "reverseMap", null);
        setField(term3178, term3178.getClass(), "pointer", null);
        setBooleanField(term3178, term3178.getClass(), "sealed", false);
        setField(term3177, term3177.getClass(), "parent", term3178);
        setField(term3177, term3177.getClass(), "namespaceMap", term3180);
        setField(term3177, term3177.getClass(), "reverseMap", term3185);
        setField(term3177, term3177.getClass(), "pointer", null);
        setBooleanField(term3177, term3177.getClass(), "sealed", false);
        setField(term3176, term3176.getClass(), "parent", term3177);
        setField(term3176, term3176.getClass(), "namespaceMap", term3191);
        setField(term3176, term3176.getClass(), "reverseMap", term3196);
        setField(term3176, term3176.getClass(), "pointer", null);
        setBooleanField(term3176, term3176.getClass(), "sealed", false);
        setField(term3175, term3175.getClass(), "parent", term3176);
        setField(term3175, term3175.getClass(), "namespaceMap", term3202);
        setField(term3175, term3175.getClass(), "reverseMap", term3207);
        setField(term3175, term3175.getClass(), "pointer", null);
        setBooleanField(term3175, term3175.getClass(), "sealed", false);
        setField(term3145, term3145.getClass(), "localNamespaceResolver", term3175);
        setIntField(term3145, term3145.getClass(), "index", -1275173084);
        setBooleanField(term3145, term3145.getClass(), "attribute", false);
        setField(term3215, term3215.getClass(), "parent", null);
        setField(term3215, term3215.getClass(), "namespaceMap", term3216);
        setField(term3215, term3215.getClass(), "reverseMap", term3221);
        setField(term3215, term3215.getClass(), "pointer", null);
        setBooleanField(term3215, term3215.getClass(), "sealed", false);
        setField(term3145, term3145.getClass(), "namespaceResolver", term3215);
        setField(term3145, term3145.getClass(), "rootNode", term3227);
        setField(term3145, term3145.getClass(), "parent", null);
        setField(term3145, term3145.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term3145, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


