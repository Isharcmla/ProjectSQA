package org.apache.commons.compress.archivers.ar;

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
import java.io.IOException;
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArArchiveInputStream_getNextEntry_1825901799104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125457;

    public ArArchiveInputStream_getNextEntry_1825901799104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125457 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term125585 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term125713 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term125841 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term125969 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126097 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126225 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126353 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126481 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126609 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126737 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126865 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term126993 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term127121 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term127249 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term127377 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term127505 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term127633 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term127761 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term127889 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128017 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128145 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128273 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128401 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128529 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128657 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128785 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term128913 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129041 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129169 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129297 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129425 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129553 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129681 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129809 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term129937 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130065 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130193 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130321 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130449 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130577 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130705 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130833 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term130961 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131089 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131217 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131345 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131473 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131601 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131729 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131857 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term131985 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term132113 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term132241 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term132369 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term132497 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term132625 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term132753 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term132885 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setLongField(term125457, term125457.getClass(), "offset", 0L);
        setField(term132753, term132753.getClass(), "input", term132885);
        setField(term132625, term132625.getClass(), "input", term132753);
        setField(term132497, term132497.getClass(), "input", term132625);
        setField(term132369, term132369.getClass(), "input", term132497);
        setField(term132241, term132241.getClass(), "input", term132369);
        setField(term132113, term132113.getClass(), "input", term132241);
        setField(term131985, term131985.getClass(), "input", term132113);
        setField(term131857, term131857.getClass(), "input", term131985);
        setField(term131729, term131729.getClass(), "input", term131857);
        setField(term131601, term131601.getClass(), "input", term131729);
        setField(term131473, term131473.getClass(), "input", term131601);
        setField(term131345, term131345.getClass(), "input", term131473);
        setField(term131217, term131217.getClass(), "input", term131345);
        setField(term131089, term131089.getClass(), "input", term131217);
        setField(term130961, term130961.getClass(), "input", term131089);
        setField(term130833, term130833.getClass(), "input", term130961);
        setField(term130705, term130705.getClass(), "input", term130833);
        setField(term130577, term130577.getClass(), "input", term130705);
        setField(term130449, term130449.getClass(), "input", term130577);
        setField(term130321, term130321.getClass(), "input", term130449);
        setField(term130193, term130193.getClass(), "input", term130321);
        setField(term130065, term130065.getClass(), "input", term130193);
        setField(term129937, term129937.getClass(), "input", term130065);
        setField(term129809, term129809.getClass(), "input", term129937);
        setField(term129681, term129681.getClass(), "input", term129809);
        setField(term129553, term129553.getClass(), "input", term129681);
        setField(term129425, term129425.getClass(), "input", term129553);
        setField(term129297, term129297.getClass(), "input", term129425);
        setField(term129169, term129169.getClass(), "input", term129297);
        setField(term129041, term129041.getClass(), "input", term129169);
        setField(term128913, term128913.getClass(), "input", term129041);
        setField(term128785, term128785.getClass(), "input", term128913);
        setField(term128657, term128657.getClass(), "input", term128785);
        setField(term128529, term128529.getClass(), "input", term128657);
        setField(term128401, term128401.getClass(), "input", term128529);
        setField(term128273, term128273.getClass(), "input", term128401);
        setField(term128145, term128145.getClass(), "input", term128273);
        setField(term128017, term128017.getClass(), "input", term128145);
        setField(term127889, term127889.getClass(), "input", term128017);
        setField(term127761, term127761.getClass(), "input", term127889);
        setField(term127633, term127633.getClass(), "input", term127761);
        setField(term127505, term127505.getClass(), "input", term127633);
        setField(term127377, term127377.getClass(), "input", term127505);
        setField(term127249, term127249.getClass(), "input", term127377);
        setField(term127121, term127121.getClass(), "input", term127249);
        setField(term126993, term126993.getClass(), "input", term127121);
        setField(term126865, term126865.getClass(), "input", term126993);
        setField(term126737, term126737.getClass(), "input", term126865);
        setField(term126609, term126609.getClass(), "input", term126737);
        setField(term126481, term126481.getClass(), "input", term126609);
        setField(term126353, term126353.getClass(), "input", term126481);
        setField(term126225, term126225.getClass(), "input", term126353);
        setField(term126097, term126097.getClass(), "input", term126225);
        setField(term125969, term125969.getClass(), "input", term126097);
        setField(term125841, term125841.getClass(), "input", term125969);
        setField(term125713, term125713.getClass(), "input", term125841);
        setField(term125585, term125585.getClass(), "input", term125713);
        setField(term125457, term125457.getClass(), "input", term125585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextEntry", argTypes, term125457, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


