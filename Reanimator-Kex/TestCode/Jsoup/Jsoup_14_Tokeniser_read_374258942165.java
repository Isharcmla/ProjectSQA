package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249169;

    public Tokeniser_read_374258942165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term249753 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term249752 = ((Class) term249753).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term249752).setAccessible(true);
        Object enum818 = ((Field) term249752).get((Object) null);
        term249169 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term249169, term249169.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term249169, term249169.getClass(), "isEmitPending", false);
        setField(term249169, term249169.getClass(), "state", enum818);
        setField(term249169, term249169.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term249169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


