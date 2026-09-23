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
import java.util.HashMap;

public class NullPropertyPointer_isContainer_200195171234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615;
     Object term2754;

    public NullPropertyPointer_isContainer_200195171234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term640 = new HashMap();
        HashMap term645 = new HashMap();
        HashMap term651 = new HashMap();
        HashMap term656 = new HashMap();
        HashMap term662 = new HashMap();
        HashMap term667 = new HashMap();
        term615 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term630 = newInstance(Class.forName("java.lang.Object"));
        Object term631 = newInstance(Class.forName("java.lang.Object"));
        Object term634 = newInstance(Class.forName("java.lang.Object"));
        Object term635 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term636 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term637 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term638 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term615, term615.getClass(), "propertyName", "RMFIsYGgne");
        setBooleanField(term615, term615.getClass(), "byNameAttribute", false);
        setIntField(term615, term615.getClass(), "propertyIndex", 1048535127);
        setField(term615, term615.getClass(), "bean", term630);
        setField(term615, term615.getClass(), "value", term631);
        setIntField(term615, term615.getClass(), "index", -655067527);
        setBooleanField(term615, term615.getClass(), "attribute", false);
        setField(term615, term615.getClass(), "rootNode", term634);
        setField(term638, term638.getClass(), "parent", null);
        setField(term638, term638.getClass(), "namespaceMap", null);
        setField(term638, term638.getClass(), "reverseMap", null);
        setField(term638, term638.getClass(), "pointer", null);
        setField(term638, term638.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term638, term638.getClass(), "sealed", false);
        setField(term637, term637.getClass(), "parent", term638);
        setField(term637, term637.getClass(), "namespaceMap", term640);
        setField(term637, term637.getClass(), "reverseMap", term645);
        setField(term637, term637.getClass(), "pointer", null);
        setField(term637, term637.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term637, term637.getClass(), "sealed", false);
        setField(term636, term636.getClass(), "parent", term637);
        setField(term636, term636.getClass(), "namespaceMap", term651);
        setField(term636, term636.getClass(), "reverseMap", term656);
        setField(term636, term636.getClass(), "pointer", null);
        setField(term636, term636.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term636, term636.getClass(), "sealed", false);
        setField(term635, term635.getClass(), "parent", term636);
        setField(term635, term635.getClass(), "namespaceMap", term662);
        setField(term635, term635.getClass(), "reverseMap", term667);
        setField(term635, term635.getClass(), "pointer", null);
        setField(term635, term635.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term635, term635.getClass(), "sealed", false);
        setField(term615, term615.getClass(), "namespaceResolver", term635);
        setField(term615, term615.getClass(), "parent", null);
        setField(term615, term615.getClass(), "locale", null);
        HashMap term2764 = new HashMap();
        HashMap term2765 = new HashMap();
        HashMap term2766 = new HashMap();
        HashMap term2767 = new HashMap();
        HashMap term2768 = new HashMap();
        HashMap term2769 = new HashMap();
        term2754 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2757 = newInstance(Class.forName("java.lang.Object"));
        Object term2758 = newInstance(Class.forName("java.lang.Object"));
        Object term2759 = newInstance(Class.forName("java.lang.Object"));
        Object term2760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2761 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2762 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2754, term2754.getClass(), "propertyName", "RMFIsYGgne");
        setBooleanField(term2754, term2754.getClass(), "byNameAttribute", false);
        setIntField(term2754, term2754.getClass(), "propertyIndex", 1048535127);
        setField(term2754, term2754.getClass(), "bean", term2757);
        setField(term2754, term2754.getClass(), "value", term2758);
        setIntField(term2754, term2754.getClass(), "index", -655067527);
        setBooleanField(term2754, term2754.getClass(), "attribute", false);
        setField(term2754, term2754.getClass(), "rootNode", term2759);
        setField(term2763, term2763.getClass(), "parent", null);
        setField(term2763, term2763.getClass(), "namespaceMap", null);
        setField(term2763, term2763.getClass(), "reverseMap", null);
        setField(term2763, term2763.getClass(), "pointer", null);
        setField(term2763, term2763.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2763, term2763.getClass(), "sealed", false);
        setField(term2762, term2762.getClass(), "parent", term2763);
        setField(term2762, term2762.getClass(), "namespaceMap", term2764);
        setField(term2762, term2762.getClass(), "reverseMap", term2765);
        setField(term2762, term2762.getClass(), "pointer", null);
        setField(term2762, term2762.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2762, term2762.getClass(), "sealed", false);
        setField(term2761, term2761.getClass(), "parent", term2762);
        setField(term2761, term2761.getClass(), "namespaceMap", term2766);
        setField(term2761, term2761.getClass(), "reverseMap", term2767);
        setField(term2761, term2761.getClass(), "pointer", null);
        setField(term2761, term2761.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2761, term2761.getClass(), "sealed", false);
        setField(term2760, term2760.getClass(), "parent", term2761);
        setField(term2760, term2760.getClass(), "namespaceMap", term2768);
        setField(term2760, term2760.getClass(), "reverseMap", term2769);
        setField(term2760, term2760.getClass(), "pointer", null);
        setField(term2760, term2760.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2760, term2760.getClass(), "sealed", false);
        setField(term2754, term2754.getClass(), "namespaceResolver", term2760);
        setField(term2754, term2754.getClass(), "parent", null);
        setField(term2754, term2754.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isContainer", argTypes, term615, args);
        assertTrue(recursiveEquals(term615, term2754));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


