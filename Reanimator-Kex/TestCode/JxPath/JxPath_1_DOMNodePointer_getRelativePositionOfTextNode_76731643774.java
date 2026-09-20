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

public class DOMNodePointer_getRelativePositionOfTextNode_76731643774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2745;

    public DOMNodePointer_getRelativePositionOfTextNode_76731643774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2746 = new HashMap();
        HashMap term2783 = new HashMap();
        HashMap term2788 = new HashMap();
        HashMap term2794 = new HashMap();
        HashMap term2799 = new HashMap();
        HashMap term2805 = new HashMap();
        HashMap term2810 = new HashMap();
        term2745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2777 = newInstance(Class.forName("java.lang.Object"));
        Object term2778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2780 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2781 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2745, term2745.getClass(), "node", null);
        setField(term2745, term2745.getClass(), "namespaces", term2746);
        setField(term2745, term2745.getClass(), "defaultNamespace", "TJmVBGfTML");
        setField(term2745, term2745.getClass(), "id", "tPlsykYBqO");
        setIntField(term2745, term2745.getClass(), "index", -1275173084);
        setBooleanField(term2745, term2745.getClass(), "attribute", false);
        setField(term2745, term2745.getClass(), "rootNode", term2777);
        setField(term2781, term2781.getClass(), "parent", null);
        setField(term2781, term2781.getClass(), "namespaceMap", null);
        setField(term2781, term2781.getClass(), "reverseMap", null);
        setField(term2781, term2781.getClass(), "pointer", null);
        setField(term2781, term2781.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2781, term2781.getClass(), "sealed", false);
        setField(term2780, term2780.getClass(), "parent", term2781);
        setField(term2780, term2780.getClass(), "namespaceMap", term2783);
        setField(term2780, term2780.getClass(), "reverseMap", term2788);
        setField(term2780, term2780.getClass(), "pointer", null);
        setField(term2780, term2780.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2780, term2780.getClass(), "sealed", false);
        setField(term2779, term2779.getClass(), "parent", term2780);
        setField(term2779, term2779.getClass(), "namespaceMap", term2794);
        setField(term2779, term2779.getClass(), "reverseMap", term2799);
        setField(term2779, term2779.getClass(), "pointer", null);
        setField(term2779, term2779.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2779, term2779.getClass(), "sealed", false);
        setField(term2778, term2778.getClass(), "parent", term2779);
        setField(term2778, term2778.getClass(), "namespaceMap", term2805);
        setField(term2778, term2778.getClass(), "reverseMap", term2810);
        setField(term2778, term2778.getClass(), "pointer", null);
        setField(term2778, term2778.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2778, term2778.getClass(), "sealed", false);
        setField(term2745, term2745.getClass(), "namespaceResolver", term2778);
        setField(term2745, term2745.getClass(), "parent", null);
        setField(term2745, term2745.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term2745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
