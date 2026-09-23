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

public class Tokeniser_read_374258942147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163580;

    public Tokeniser_read_374258942147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term163499 = (char[]) newCharArray(0);
        StringBuilder term163640 = new StringBuilder();
        ((StringBuilder) term163640).append(term163499);
        term163580 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term163580, term163580.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term163580, term163580.getClass(), "isEmitPending", true);
        setField(term163580, term163580.getClass(), "charsBuilder", term163640);
        setField(term163580, term163580.getClass(), "charsString", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term163580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


