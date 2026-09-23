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

public class JDOMNodePointer_getRelativePositionOfElement_97393006677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3159;

    public JDOMNodePointer_getRelativePositionOfElement_97393006677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3178 = new HashMap();
        HashMap term3183 = new HashMap();
        HashMap term3189 = new HashMap();
        HashMap term3194 = new HashMap();
        HashMap term3200 = new HashMap();
        HashMap term3205 = new HashMap();
        HashMap term3216 = new HashMap();
        HashMap term3221 = new HashMap();
        HashMap term3227 = new HashMap();
        HashMap term3232 = new HashMap();
        HashMap term3238 = new HashMap();
        HashMap term3243 = new HashMap();
        term3159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3160 = newInstance(Class.forName("java.lang.Object"));
        Object term3173 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3174 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3176 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3214 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3215 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3249 = newInstance(Class.forName("java.lang.Object"));
        setField(term3159, term3159.getClass(), "node", term3160);
        setField(term3159, term3159.getClass(), "id", "LvtrsXUliU");
        setField(term3176, term3176.getClass(), "parent", null);
        setField(term3176, term3176.getClass(), "namespaceMap", null);
        setField(term3176, term3176.getClass(), "reverseMap", null);
        setField(term3176, term3176.getClass(), "pointer", null);
        setBooleanField(term3176, term3176.getClass(), "sealed", false);
        setField(term3175, term3175.getClass(), "parent", term3176);
        setField(term3175, term3175.getClass(), "namespaceMap", term3178);
        setField(term3175, term3175.getClass(), "reverseMap", term3183);
        setField(term3175, term3175.getClass(), "pointer", null);
        setBooleanField(term3175, term3175.getClass(), "sealed", false);
        setField(term3174, term3174.getClass(), "parent", term3175);
        setField(term3174, term3174.getClass(), "namespaceMap", term3189);
        setField(term3174, term3174.getClass(), "reverseMap", term3194);
        setField(term3174, term3174.getClass(), "pointer", null);
        setBooleanField(term3174, term3174.getClass(), "sealed", false);
        setField(term3173, term3173.getClass(), "parent", term3174);
        setField(term3173, term3173.getClass(), "namespaceMap", term3200);
        setField(term3173, term3173.getClass(), "reverseMap", term3205);
        setField(term3173, term3173.getClass(), "pointer", null);
        setBooleanField(term3173, term3173.getClass(), "sealed", false);
        setField(term3159, term3159.getClass(), "localNamespaceResolver", term3173);
        setIntField(term3159, term3159.getClass(), "index", -1275173084);
        setBooleanField(term3159, term3159.getClass(), "attribute", false);
        setField(term3215, term3215.getClass(), "parent", null);
        setField(term3215, term3215.getClass(), "namespaceMap", term3216);
        setField(term3215, term3215.getClass(), "reverseMap", term3221);
        setField(term3215, term3215.getClass(), "pointer", null);
        setBooleanField(term3215, term3215.getClass(), "sealed", false);
        setField(term3214, term3214.getClass(), "parent", term3215);
        setField(term3214, term3214.getClass(), "namespaceMap", term3227);
        setField(term3214, term3214.getClass(), "reverseMap", term3232);
        setField(term3214, term3214.getClass(), "pointer", null);
        setBooleanField(term3214, term3214.getClass(), "sealed", false);
        setField(term3213, term3213.getClass(), "parent", term3214);
        setField(term3213, term3213.getClass(), "namespaceMap", term3238);
        setField(term3213, term3213.getClass(), "reverseMap", term3243);
        setField(term3213, term3213.getClass(), "pointer", null);
        setBooleanField(term3213, term3213.getClass(), "sealed", false);
        setField(term3159, term3159.getClass(), "namespaceResolver", term3213);
        setField(term3159, term3159.getClass(), "rootNode", term3249);
        setField(term3159, term3159.getClass(), "parent", null);
        setField(term3159, term3159.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term3159, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


