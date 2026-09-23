package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class DoubleMetaphone_contains_164329157775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2210;
     Object term2212;
     Object term2214;
     Object term12746;

    public DoubleMetaphone_contains_164329157775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2210 = new Integer(-478195677);
        term2212 = new Integer(972867650);
        term2214 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2214, 0, "kuTXqwMtDB");
        setElement(term2214, 1, "Ghbwtircqb");
        setElement(term2214, 2, "xrwlQZdwCp");
        setElement(term2214, 3, "IDCWpPLRkE");
        setElement(term2214, 4, "nyiiPDVjAc");
        term12746 = (Object[]) newArray("java.lang.String", 5);
        setElement(term12746, 0, "kuTXqwMtDB");
        setElement(term12746, 1, "Ghbwtircqb");
        setElement(term12746, 2, "xrwlQZdwCp");
        setElement(term12746, 3, "IDCWpPLRkE");
        setElement(term12746, 4, "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = "SbAoxhfrkn";
        args[1] = term2210;
        args[2] = term2212;
        args[3] = term2214;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term2210, -478195677));
        assertTrue(recursiveEquals(term2212, 972867650));
        assertTrue(recursiveEquals(term2214, term12746));
        assertTrue(recursiveEquals(retValue, false));
    }

};


