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

public class NullPropertyPointer_isCollection_7518843374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10765;
     Object term10968;

    public NullPropertyPointer_isCollection_7518843374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setIntField(term10765, term10765.getClass(), "index", -2147483648);
        term10968 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term10968, term10968.getClass(), "propertyName", null);
        setBooleanField(term10968, term10968.getClass(), "byNameAttribute", false);
        setIntField(term10968, term10968.getClass(), "propertyIndex", 0);
        setField(term10968, term10968.getClass(), "bean", null);
        setField(term10968, term10968.getClass(), "value", null);
        setIntField(term10968, term10968.getClass(), "index", -2147483648);
        setBooleanField(term10968, term10968.getClass(), "attribute", false);
        setField(term10968, term10968.getClass(), "rootNode", null);
        setField(term10968, term10968.getClass(), "namespaceResolver", null);
        setField(term10968, term10968.getClass(), "parent", null);
        setField(term10968, term10968.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term10765, args);
        assertTrue(recursiveEquals(term10765, term10968));
        assertTrue(recursiveEquals(retValue, false));
    }

};


