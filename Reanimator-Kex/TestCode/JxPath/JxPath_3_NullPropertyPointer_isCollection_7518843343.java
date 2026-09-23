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

public class NullPropertyPointer_isCollection_7518843343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1368;
     Object term4640;

    public NullPropertyPointer_isCollection_7518843343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1393 = new HashMap();
        HashMap term1398 = new HashMap();
        HashMap term1404 = new HashMap();
        HashMap term1409 = new HashMap();
        HashMap term1415 = new HashMap();
        HashMap term1420 = new HashMap();
        term1368 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1383 = newInstance(Class.forName("java.lang.Object"));
        Object term1384 = newInstance(Class.forName("java.lang.Object"));
        Object term1387 = newInstance(Class.forName("java.lang.Object"));
        Object term1388 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1389 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1391 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1368, term1368.getClass(), "propertyName", "BYqFIqCKAV");
        setBooleanField(term1368, term1368.getClass(), "byNameAttribute", true);
        setIntField(term1368, term1368.getClass(), "propertyIndex", 679763016);
        setField(term1368, term1368.getClass(), "bean", term1383);
        setField(term1368, term1368.getClass(), "value", term1384);
        setIntField(term1368, term1368.getClass(), "index", 1962444399);
        setBooleanField(term1368, term1368.getClass(), "attribute", true);
        setField(term1368, term1368.getClass(), "rootNode", term1387);
        setField(term1391, term1391.getClass(), "parent", null);
        setField(term1391, term1391.getClass(), "namespaceMap", null);
        setField(term1391, term1391.getClass(), "reverseMap", null);
        setField(term1391, term1391.getClass(), "pointer", null);
        setField(term1391, term1391.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1391, term1391.getClass(), "sealed", false);
        setField(term1390, term1390.getClass(), "parent", term1391);
        setField(term1390, term1390.getClass(), "namespaceMap", term1393);
        setField(term1390, term1390.getClass(), "reverseMap", term1398);
        setField(term1390, term1390.getClass(), "pointer", null);
        setField(term1390, term1390.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1390, term1390.getClass(), "sealed", false);
        setField(term1389, term1389.getClass(), "parent", term1390);
        setField(term1389, term1389.getClass(), "namespaceMap", term1404);
        setField(term1389, term1389.getClass(), "reverseMap", term1409);
        setField(term1389, term1389.getClass(), "pointer", null);
        setField(term1389, term1389.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1389, term1389.getClass(), "sealed", false);
        setField(term1388, term1388.getClass(), "parent", term1389);
        setField(term1388, term1388.getClass(), "namespaceMap", term1415);
        setField(term1388, term1388.getClass(), "reverseMap", term1420);
        setField(term1388, term1388.getClass(), "pointer", null);
        setField(term1388, term1388.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1388, term1388.getClass(), "sealed", false);
        setField(term1368, term1368.getClass(), "namespaceResolver", term1388);
        setField(term1368, term1368.getClass(), "parent", null);
        setField(term1368, term1368.getClass(), "locale", null);
        HashMap term4650 = new HashMap();
        HashMap term4651 = new HashMap();
        HashMap term4652 = new HashMap();
        HashMap term4653 = new HashMap();
        HashMap term4654 = new HashMap();
        HashMap term4655 = new HashMap();
        term4640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term4643 = newInstance(Class.forName("java.lang.Object"));
        Object term4644 = newInstance(Class.forName("java.lang.Object"));
        Object term4645 = newInstance(Class.forName("java.lang.Object"));
        Object term4646 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4647 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4648 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4649 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4640, term4640.getClass(), "propertyName", "BYqFIqCKAV");
        setBooleanField(term4640, term4640.getClass(), "byNameAttribute", true);
        setIntField(term4640, term4640.getClass(), "propertyIndex", 679763016);
        setField(term4640, term4640.getClass(), "bean", term4643);
        setField(term4640, term4640.getClass(), "value", term4644);
        setIntField(term4640, term4640.getClass(), "index", 1962444399);
        setBooleanField(term4640, term4640.getClass(), "attribute", true);
        setField(term4640, term4640.getClass(), "rootNode", term4645);
        setField(term4649, term4649.getClass(), "parent", null);
        setField(term4649, term4649.getClass(), "namespaceMap", null);
        setField(term4649, term4649.getClass(), "reverseMap", null);
        setField(term4649, term4649.getClass(), "pointer", null);
        setField(term4649, term4649.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4649, term4649.getClass(), "sealed", false);
        setField(term4648, term4648.getClass(), "parent", term4649);
        setField(term4648, term4648.getClass(), "namespaceMap", term4650);
        setField(term4648, term4648.getClass(), "reverseMap", term4651);
        setField(term4648, term4648.getClass(), "pointer", null);
        setField(term4648, term4648.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4648, term4648.getClass(), "sealed", false);
        setField(term4647, term4647.getClass(), "parent", term4648);
        setField(term4647, term4647.getClass(), "namespaceMap", term4652);
        setField(term4647, term4647.getClass(), "reverseMap", term4653);
        setField(term4647, term4647.getClass(), "pointer", null);
        setField(term4647, term4647.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4647, term4647.getClass(), "sealed", false);
        setField(term4646, term4646.getClass(), "parent", term4647);
        setField(term4646, term4646.getClass(), "namespaceMap", term4654);
        setField(term4646, term4646.getClass(), "reverseMap", term4655);
        setField(term4646, term4646.getClass(), "pointer", null);
        setField(term4646, term4646.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4646, term4646.getClass(), "sealed", false);
        setField(term4640, term4640.getClass(), "namespaceResolver", term4646);
        setField(term4640, term4640.getClass(), "parent", null);
        setField(term4640, term4640.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1368, args);
        assertTrue(recursiveEquals(term1368, term4640));
        assertTrue(recursiveEquals(retValue, true));
    }

};


