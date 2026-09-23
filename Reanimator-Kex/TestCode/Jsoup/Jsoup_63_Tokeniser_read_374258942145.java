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
import java.lang.StringBuilder;

public class Tokeniser_read_374258942145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163047;

    public Tokeniser_read_374258942145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term162967 = (char[]) newCharArray(1);
        StringBuilder term163107 = new StringBuilder();
        ((StringBuilder) term163107).append(term162967);
        term163047 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term163047, term163047.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term163047, term163047.getClass(), "isEmitPending", true);
        setField(term163047, term163047.getClass(), "charsBuilder", term163107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term163047, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


