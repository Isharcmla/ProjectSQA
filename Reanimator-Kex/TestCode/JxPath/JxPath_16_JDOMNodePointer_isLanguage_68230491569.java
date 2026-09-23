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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_isLanguage_68230491569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1964;

    public JDOMNodePointer_isLanguage_68230491569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1983 = new HashMap();
        HashMap term1988 = new HashMap();
        HashMap term1994 = new HashMap();
        HashMap term1999 = new HashMap();
        HashMap term2005 = new HashMap();
        HashMap term2010 = new HashMap();
        HashMap term2022 = new HashMap();
        HashMap term2028 = new HashMap();
        HashMap term2033 = new HashMap();
        HashMap term2039 = new HashMap();
        HashMap term2044 = new HashMap();
        term1964 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1965 = newInstance(Class.forName("java.lang.Object"));
        Object term1978 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2018 = newInstance(Class.forName("java.lang.Object"));
        Object term2019 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2020 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2021 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1964, term1964.getClass(), "node", term1965);
        setField(term1964, term1964.getClass(), "id", "flxyYxBRtu");
        setField(term1981, term1981.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "namespaceMap", null);
        setField(term1981, term1981.getClass(), "reverseMap", null);
        setField(term1981, term1981.getClass(), "pointer", null);
        setBooleanField(term1981, term1981.getClass(), "sealed", false);
        setField(term1980, term1980.getClass(), "parent", term1981);
        setField(term1980, term1980.getClass(), "namespaceMap", term1983);
        setField(term1980, term1980.getClass(), "reverseMap", term1988);
        setField(term1980, term1980.getClass(), "pointer", null);
        setBooleanField(term1980, term1980.getClass(), "sealed", false);
        setField(term1979, term1979.getClass(), "parent", term1980);
        setField(term1979, term1979.getClass(), "namespaceMap", term1994);
        setField(term1979, term1979.getClass(), "reverseMap", term1999);
        setField(term1979, term1979.getClass(), "pointer", null);
        setBooleanField(term1979, term1979.getClass(), "sealed", false);
        setField(term1978, term1978.getClass(), "parent", term1979);
        setField(term1978, term1978.getClass(), "namespaceMap", term2005);
        setField(term1978, term1978.getClass(), "reverseMap", term2010);
        setField(term1978, term1978.getClass(), "pointer", null);
        setBooleanField(term1978, term1978.getClass(), "sealed", false);
        setField(term1964, term1964.getClass(), "localNamespaceResolver", term1978);
        setIntField(term1964, term1964.getClass(), "index", 1622346318);
        setBooleanField(term1964, term1964.getClass(), "attribute", false);
        setField(term1964, term1964.getClass(), "rootNode", term2018);
        setField(term2021, term2021.getClass(), "parent", null);
        setField(term2021, term2021.getClass(), "namespaceMap", term2022);
        setField(term2021, term2021.getClass(), "reverseMap", null);
        setField(term2021, term2021.getClass(), "pointer", null);
        setBooleanField(term2021, term2021.getClass(), "sealed", false);
        setField(term2020, term2020.getClass(), "parent", term2021);
        setField(term2020, term2020.getClass(), "namespaceMap", term2028);
        setField(term2020, term2020.getClass(), "reverseMap", term2033);
        setField(term2020, term2020.getClass(), "pointer", null);
        setBooleanField(term2020, term2020.getClass(), "sealed", false);
        setField(term2019, term2019.getClass(), "parent", term2020);
        setField(term2019, term2019.getClass(), "namespaceMap", term2039);
        setField(term2019, term2019.getClass(), "reverseMap", term2044);
        setField(term2019, term2019.getClass(), "pointer", null);
        setBooleanField(term2019, term2019.getClass(), "sealed", false);
        setField(term1964, term1964.getClass(), "namespaceResolver", term2019);
        setField(term1964, term1964.getClass(), "parent", null);
        setField(term1964, term1964.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        try {
            callMethod(klass, "isLanguage", argTypes, term1964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


