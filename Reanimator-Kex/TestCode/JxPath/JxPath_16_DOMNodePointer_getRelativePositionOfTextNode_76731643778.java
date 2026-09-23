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

public class DOMNodePointer_getRelativePositionOfTextNode_76731643778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3135;

    public DOMNodePointer_getRelativePositionOfTextNode_76731643778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3136 = new HashMap();
        HashMap term3170 = new HashMap();
        HashMap term3175 = new HashMap();
        HashMap term3181 = new HashMap();
        HashMap term3186 = new HashMap();
        HashMap term3192 = new HashMap();
        HashMap term3197 = new HashMap();
        HashMap term3207 = new HashMap();
        term3135 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3165 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3166 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3168 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3205 = newInstance(Class.forName("java.lang.Object"));
        Object term3206 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3135, term3135.getClass(), "node", null);
        setField(term3135, term3135.getClass(), "namespaces", term3136);
        setField(term3135, term3135.getClass(), "defaultNamespace", "HqBOwkVqjD");
        setField(term3135, term3135.getClass(), "id", "MAcUBcBckh");
        setField(term3168, term3168.getClass(), "parent", null);
        setField(term3168, term3168.getClass(), "namespaceMap", null);
        setField(term3168, term3168.getClass(), "reverseMap", null);
        setField(term3168, term3168.getClass(), "pointer", null);
        setBooleanField(term3168, term3168.getClass(), "sealed", false);
        setField(term3167, term3167.getClass(), "parent", term3168);
        setField(term3167, term3167.getClass(), "namespaceMap", term3170);
        setField(term3167, term3167.getClass(), "reverseMap", term3175);
        setField(term3167, term3167.getClass(), "pointer", null);
        setBooleanField(term3167, term3167.getClass(), "sealed", false);
        setField(term3166, term3166.getClass(), "parent", term3167);
        setField(term3166, term3166.getClass(), "namespaceMap", term3181);
        setField(term3166, term3166.getClass(), "reverseMap", term3186);
        setField(term3166, term3166.getClass(), "pointer", null);
        setBooleanField(term3166, term3166.getClass(), "sealed", false);
        setField(term3165, term3165.getClass(), "parent", term3166);
        setField(term3165, term3165.getClass(), "namespaceMap", term3192);
        setField(term3165, term3165.getClass(), "reverseMap", term3197);
        setField(term3165, term3165.getClass(), "pointer", null);
        setBooleanField(term3165, term3165.getClass(), "sealed", false);
        setField(term3135, term3135.getClass(), "localNamespaceResolver", term3165);
        setIntField(term3135, term3135.getClass(), "index", -244121226);
        setBooleanField(term3135, term3135.getClass(), "attribute", true);
        setField(term3135, term3135.getClass(), "rootNode", term3205);
        setField(term3206, term3206.getClass(), "parent", null);
        setField(term3206, term3206.getClass(), "namespaceMap", term3207);
        setField(term3206, term3206.getClass(), "reverseMap", null);
        setField(term3206, term3206.getClass(), "pointer", null);
        setBooleanField(term3206, term3206.getClass(), "sealed", false);
        setField(term3135, term3135.getClass(), "namespaceResolver", term3206);
        setField(term3135, term3135.getClass(), "parent", null);
        setField(term3135, term3135.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term3135, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


