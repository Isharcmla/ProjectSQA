package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51367;
     Object term51467;

    public ZonedChronology_assemble_1604148452149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51367 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term51367, term51367.getClass(), "iParam", null);
        term51467 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term51571 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term51655 = newInstance(Class.forName("org.joda.time.field.ScaledDurationField"));
        setField(term51467, term51467.getClass(), "eras", null);
        setField(term51467, term51467.getClass(), "centuries", null);
        setField(term51467, term51467.getClass(), "years", null);
        setField(term51467, term51467.getClass(), "months", null);
        setField(term51467, term51467.getClass(), "weekyears", null);
        setField(term51467, term51467.getClass(), "weeks", null);
        setField(term51467, term51467.getClass(), "days", null);
        setField(term51467, term51467.getClass(), "halfdays", null);
        setField(term51467, term51467.getClass(), "hours", null);
        setField(term51467, term51467.getClass(), "minutes", null);
        setField(term51467, term51467.getClass(), "seconds", null);
        setField(term51467, term51467.getClass(), "millis", null);
        setField(term51571, term51571.getClass(), "iUnitField", term51655);
        setField(term51467, term51467.getClass(), "year", term51571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term51467;
        try {
            callMethod(klass, "assemble", argTypes, term51367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


