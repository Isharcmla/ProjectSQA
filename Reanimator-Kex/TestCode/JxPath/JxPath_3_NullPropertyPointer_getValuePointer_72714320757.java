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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;
import java.lang.Object;

public class NullPropertyPointer_getValuePointer_72714320757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6776;
     Object term7089;
     Object term7082;

    public NullPropertyPointer_getValuePointer_72714320757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term6776, term6776.getClass(), "propertyName", "");
        term7089 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term7089, term7089.getClass(), "propertyName", "");
        setBooleanField(term7089, term7089.getClass(), "byNameAttribute", false);
        setIntField(term7089, term7089.getClass(), "propertyIndex", 0);
        setField(term7089, term7089.getClass(), "bean", null);
        setField(term7089, term7089.getClass(), "value", null);
        setIntField(term7089, term7089.getClass(), "index", 0);
        setBooleanField(term7089, term7089.getClass(), "attribute", false);
        setField(term7089, term7089.getClass(), "rootNode", null);
        setField(term7089, term7089.getClass(), "namespaceResolver", null);
        setField(term7089, term7089.getClass(), "parent", null);
        setField(term7089, term7089.getClass(), "locale", null);
        term7082 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term7083 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term7086 = newInstance(Class.forName("java.lang.Object"));
        Object term7069 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term7083, term7083.getClass(), "prefix", null);
        setField(term7083, term7083.getClass(), "name", "");
        setField(term7082, term7082.getClass(), "name", term7083);
        setField(term7082, term7082.getClass(), "id", null);
        setField(term7082, term7082.getClass(), "value", term7086);
        setIntField(term7082, term7082.getClass(), "index", -2147483648);
        setBooleanField(term7082, term7082.getClass(), "attribute", false);
        setField(term7082, term7082.getClass(), "rootNode", null);
        setField(term7082, term7082.getClass(), "namespaceResolver", null);
        setField(term7069, term7069.getClass(), "propertyName", "");
        setBooleanField(term7069, term7069.getClass(), "byNameAttribute", false);
        setIntField(term7069, term7069.getClass(), "propertyIndex", 0);
        setField(term7069, term7069.getClass(), "bean", null);
        setField(term7069, term7069.getClass(), "value", null);
        setIntField(term7069, term7069.getClass(), "index", 0);
        setBooleanField(term7069, term7069.getClass(), "attribute", false);
        setField(term7069, term7069.getClass(), "rootNode", null);
        setField(term7069, term7069.getClass(), "namespaceResolver", null);
        setField(term7069, term7069.getClass(), "parent", null);
        setField(term7069, term7069.getClass(), "locale", null);
        setField(term7082, term7082.getClass(), "parent", term7069);
        setField(term7082, term7082.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValuePointer", argTypes, term6776, args);
        assertTrue(recursiveEquals(term6776, term7089));
        assertTrue(recursiveEquals(retValue, term7082));
    }

};


