package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class NullPropertyPointer_createPath_110593220336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;

    public NullPropertyPointer_createPath_110593220336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term777 = new HashMap();
        HashMap term782 = new HashMap();
        HashMap term788 = new HashMap();
        HashMap term793 = new HashMap();
        HashMap term799 = new HashMap();
        HashMap term804 = new HashMap();
        term752 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term767 = newInstance(Class.forName("java.lang.Object"));
        Object term768 = newInstance(Class.forName("java.lang.Object"));
        Object term771 = newInstance(Class.forName("java.lang.Object"));
        Object term772 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term774 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term752, term752.getClass(), "propertyName", "uuaPigETmJ");
        setBooleanField(term752, term752.getClass(), "byNameAttribute", true);
        setIntField(term752, term752.getClass(), "propertyIndex", -117576464);
        setField(term752, term752.getClass(), "bean", term767);
        setField(term752, term752.getClass(), "value", term768);
        setIntField(term752, term752.getClass(), "index", -1007160944);
        setBooleanField(term752, term752.getClass(), "attribute", true);
        setField(term752, term752.getClass(), "rootNode", term771);
        setField(term775, term775.getClass(), "parent", null);
        setField(term775, term775.getClass(), "namespaceMap", null);
        setField(term775, term775.getClass(), "reverseMap", null);
        setField(term775, term775.getClass(), "pointer", null);
        setField(term775, term775.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term775, term775.getClass(), "sealed", false);
        setField(term774, term774.getClass(), "parent", term775);
        setField(term774, term774.getClass(), "namespaceMap", term777);
        setField(term774, term774.getClass(), "reverseMap", term782);
        setField(term774, term774.getClass(), "pointer", null);
        setField(term774, term774.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term774, term774.getClass(), "sealed", false);
        setField(term773, term773.getClass(), "parent", term774);
        setField(term773, term773.getClass(), "namespaceMap", term788);
        setField(term773, term773.getClass(), "reverseMap", term793);
        setField(term773, term773.getClass(), "pointer", null);
        setField(term773, term773.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term773, term773.getClass(), "sealed", false);
        setField(term772, term772.getClass(), "parent", term773);
        setField(term772, term772.getClass(), "namespaceMap", term799);
        setField(term772, term772.getClass(), "reverseMap", term804);
        setField(term772, term772.getClass(), "pointer", null);
        setField(term772, term772.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term772, term772.getClass(), "sealed", false);
        setField(term752, term752.getClass(), "namespaceResolver", term772);
        setField(term752, term752.getClass(), "parent", null);
        setField(term752, term752.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createPath", argTypes, term752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


