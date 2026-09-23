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

public class DOMNodePointer_stringValue_212917030386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3626;

    public DOMNodePointer_stringValue_212917030386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3627 = new HashMap();
        HashMap term3661 = new HashMap();
        HashMap term3666 = new HashMap();
        HashMap term3672 = new HashMap();
        HashMap term3677 = new HashMap();
        HashMap term3683 = new HashMap();
        HashMap term3688 = new HashMap();
        HashMap term3698 = new HashMap();
        term3626 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3657 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3659 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3696 = newInstance(Class.forName("java.lang.Object"));
        Object term3697 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3626, term3626.getClass(), "node", null);
        setField(term3626, term3626.getClass(), "namespaces", term3627);
        setField(term3626, term3626.getClass(), "defaultNamespace", "cAPeiZHKGJ");
        setField(term3626, term3626.getClass(), "id", "LvJFtLBaxj");
        setField(term3659, term3659.getClass(), "parent", null);
        setField(term3659, term3659.getClass(), "namespaceMap", null);
        setField(term3659, term3659.getClass(), "reverseMap", null);
        setField(term3659, term3659.getClass(), "pointer", null);
        setBooleanField(term3659, term3659.getClass(), "sealed", false);
        setField(term3658, term3658.getClass(), "parent", term3659);
        setField(term3658, term3658.getClass(), "namespaceMap", term3661);
        setField(term3658, term3658.getClass(), "reverseMap", term3666);
        setField(term3658, term3658.getClass(), "pointer", null);
        setBooleanField(term3658, term3658.getClass(), "sealed", false);
        setField(term3657, term3657.getClass(), "parent", term3658);
        setField(term3657, term3657.getClass(), "namespaceMap", term3672);
        setField(term3657, term3657.getClass(), "reverseMap", term3677);
        setField(term3657, term3657.getClass(), "pointer", null);
        setBooleanField(term3657, term3657.getClass(), "sealed", false);
        setField(term3656, term3656.getClass(), "parent", term3657);
        setField(term3656, term3656.getClass(), "namespaceMap", term3683);
        setField(term3656, term3656.getClass(), "reverseMap", term3688);
        setField(term3656, term3656.getClass(), "pointer", null);
        setBooleanField(term3656, term3656.getClass(), "sealed", false);
        setField(term3626, term3626.getClass(), "localNamespaceResolver", term3656);
        setIntField(term3626, term3626.getClass(), "index", 1193880199);
        setBooleanField(term3626, term3626.getClass(), "attribute", true);
        setField(term3626, term3626.getClass(), "rootNode", term3696);
        setField(term3697, term3697.getClass(), "parent", null);
        setField(term3697, term3697.getClass(), "namespaceMap", term3698);
        setField(term3697, term3697.getClass(), "reverseMap", null);
        setField(term3697, term3697.getClass(), "pointer", null);
        setBooleanField(term3697, term3697.getClass(), "sealed", false);
        setField(term3626, term3626.getClass(), "namespaceResolver", term3697);
        setField(term3626, term3626.getClass(), "parent", null);
        setField(term3626, term3626.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "stringValue", argTypes, term3626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


