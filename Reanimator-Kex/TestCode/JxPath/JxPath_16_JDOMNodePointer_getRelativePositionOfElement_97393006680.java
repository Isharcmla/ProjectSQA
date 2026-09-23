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

public class JDOMNodePointer_getRelativePositionOfElement_97393006680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3147;

    public JDOMNodePointer_getRelativePositionOfElement_97393006680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3166 = new HashMap();
        HashMap term3171 = new HashMap();
        HashMap term3177 = new HashMap();
        HashMap term3182 = new HashMap();
        HashMap term3188 = new HashMap();
        HashMap term3193 = new HashMap();
        HashMap term3205 = new HashMap();
        HashMap term3211 = new HashMap();
        HashMap term3216 = new HashMap();
        HashMap term3222 = new HashMap();
        HashMap term3227 = new HashMap();
        term3147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3148 = newInstance(Class.forName("java.lang.Object"));
        Object term3161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3162 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3163 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3164 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3201 = newInstance(Class.forName("java.lang.Object"));
        Object term3202 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3204 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3147, term3147.getClass(), "node", term3148);
        setField(term3147, term3147.getClass(), "id", "jDtqGUpnZN");
        setField(term3164, term3164.getClass(), "parent", null);
        setField(term3164, term3164.getClass(), "namespaceMap", null);
        setField(term3164, term3164.getClass(), "reverseMap", null);
        setField(term3164, term3164.getClass(), "pointer", null);
        setBooleanField(term3164, term3164.getClass(), "sealed", false);
        setField(term3163, term3163.getClass(), "parent", term3164);
        setField(term3163, term3163.getClass(), "namespaceMap", term3166);
        setField(term3163, term3163.getClass(), "reverseMap", term3171);
        setField(term3163, term3163.getClass(), "pointer", null);
        setBooleanField(term3163, term3163.getClass(), "sealed", false);
        setField(term3162, term3162.getClass(), "parent", term3163);
        setField(term3162, term3162.getClass(), "namespaceMap", term3177);
        setField(term3162, term3162.getClass(), "reverseMap", term3182);
        setField(term3162, term3162.getClass(), "pointer", null);
        setBooleanField(term3162, term3162.getClass(), "sealed", false);
        setField(term3161, term3161.getClass(), "parent", term3162);
        setField(term3161, term3161.getClass(), "namespaceMap", term3188);
        setField(term3161, term3161.getClass(), "reverseMap", term3193);
        setField(term3161, term3161.getClass(), "pointer", null);
        setBooleanField(term3161, term3161.getClass(), "sealed", false);
        setField(term3147, term3147.getClass(), "localNamespaceResolver", term3161);
        setIntField(term3147, term3147.getClass(), "index", -244121226);
        setBooleanField(term3147, term3147.getClass(), "attribute", true);
        setField(term3147, term3147.getClass(), "rootNode", term3201);
        setField(term3204, term3204.getClass(), "parent", null);
        setField(term3204, term3204.getClass(), "namespaceMap", term3205);
        setField(term3204, term3204.getClass(), "reverseMap", null);
        setField(term3204, term3204.getClass(), "pointer", null);
        setBooleanField(term3204, term3204.getClass(), "sealed", false);
        setField(term3203, term3203.getClass(), "parent", term3204);
        setField(term3203, term3203.getClass(), "namespaceMap", term3211);
        setField(term3203, term3203.getClass(), "reverseMap", term3216);
        setField(term3203, term3203.getClass(), "pointer", null);
        setBooleanField(term3203, term3203.getClass(), "sealed", false);
        setField(term3202, term3202.getClass(), "parent", term3203);
        setField(term3202, term3202.getClass(), "namespaceMap", term3222);
        setField(term3202, term3202.getClass(), "reverseMap", term3227);
        setField(term3202, term3202.getClass(), "pointer", null);
        setBooleanField(term3202, term3202.getClass(), "sealed", false);
        setField(term3147, term3147.getClass(), "namespaceResolver", term3202);
        setField(term3147, term3147.getClass(), "parent", null);
        setField(term3147, term3147.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term3147, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


