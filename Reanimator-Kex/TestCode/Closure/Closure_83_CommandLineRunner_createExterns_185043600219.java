package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class CommandLineRunner_createExterns_185043600219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41313;
     Object term41989;
     Object term41947;

    public CommandLineRunner_createExterns_185043600219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term41515 = new ArrayList();
        term41313 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term41463 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        Object term41625 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        setBooleanField(term41313, term41313.getClass(), "testMode", false);
        setField(term41463, term41463.getClass(), "externs", term41515);
        setField(term41313, term41313.getClass(), "config", term41463);
        setBooleanField(term41625, term41625.getClass(), "use_only_custom_externs", true);
        setField(term41313, term41313.getClass(), "flags", term41625);
        ArrayList term41992 = new ArrayList();
        term41989 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term41990 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        Object term41991 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setBooleanField(term41990, term41990.getClass(), "display_help", false);
        setBooleanField(term41990, term41990.getClass(), "print_tree", false);
        setBooleanField(term41990, term41990.getClass(), "compute_phase_ordering", false);
        setBooleanField(term41990, term41990.getClass(), "print_ast", false);
        setBooleanField(term41990, term41990.getClass(), "print_pass_graph", false);
        setField(term41990, term41990.getClass(), "jscomp_dev_mode", null);
        setField(term41990, term41990.getClass(), "logging_level", null);
        setField(term41990, term41990.getClass(), "externs", null);
        setField(term41990, term41990.getClass(), "js", null);
        setField(term41990, term41990.getClass(), "js_output_file", null);
        setField(term41990, term41990.getClass(), "module", null);
        setField(term41990, term41990.getClass(), "variable_map_input_file", null);
        setField(term41990, term41990.getClass(), "property_map_input_file", null);
        setField(term41990, term41990.getClass(), "variable_map_output_file", null);
        setBooleanField(term41990, term41990.getClass(), "create_name_map_files", false);
        setField(term41990, term41990.getClass(), "property_map_output_file", null);
        setBooleanField(term41990, term41990.getClass(), "third_party", false);
        setIntField(term41990, term41990.getClass(), "summary_detail_level", 0);
        setField(term41990, term41990.getClass(), "output_wrapper", null);
        setField(term41990, term41990.getClass(), "output_wrapper_marker", null);
        setField(term41990, term41990.getClass(), "module_wrapper", null);
        setField(term41990, term41990.getClass(), "module_output_path_prefix", null);
        setField(term41990, term41990.getClass(), "create_source_map", null);
        setField(term41990, term41990.getClass(), "jscomp_error", null);
        setField(term41990, term41990.getClass(), "jscomp_warning", null);
        setField(term41990, term41990.getClass(), "jscomp_off", null);
        setField(term41990, term41990.getClass(), "define", null);
        setField(term41990, term41990.getClass(), "charset", null);
        setField(term41990, term41990.getClass(), "compilation_level", null);
        setField(term41990, term41990.getClass(), "warning_level", null);
        setBooleanField(term41990, term41990.getClass(), "use_only_custom_externs", true);
        setBooleanField(term41990, term41990.getClass(), "debug", false);
        setField(term41990, term41990.getClass(), "formatting", null);
        setBooleanField(term41990, term41990.getClass(), "process_closure_primitives", false);
        setBooleanField(term41990, term41990.getClass(), "manage_closure_dependencies", false);
        setField(term41990, term41990.getClass(), "closure_entry_point", null);
        setField(term41990, term41990.getClass(), "output_manifest", null);
        setBooleanField(term41990, term41990.getClass(), "version", false);
        setField(term41989, term41989.getClass(), "flags", term41990);
        setBooleanField(term41989, term41989.getClass(), "isConfigValid", false);
        setBooleanField(term41991, term41991.getClass(), "printTree", false);
        setBooleanField(term41991, term41991.getClass(), "computePhaseOrdering", false);
        setBooleanField(term41991, term41991.getClass(), "printAst", false);
        setBooleanField(term41991, term41991.getClass(), "printPassGraph", false);
        setField(term41991, term41991.getClass(), "jscompDevMode", null);
        setField(term41991, term41991.getClass(), "loggingLevel", null);
        setField(term41991, term41991.getClass(), "externs", term41992);
        setField(term41991, term41991.getClass(), "js", null);
        setField(term41991, term41991.getClass(), "jsOutputFile", null);
        setField(term41991, term41991.getClass(), "module", null);
        setField(term41991, term41991.getClass(), "variableMapInputFile", null);
        setField(term41991, term41991.getClass(), "propertyMapInputFile", null);
        setField(term41991, term41991.getClass(), "variableMapOutputFile", null);
        setBooleanField(term41991, term41991.getClass(), "createNameMapFiles", false);
        setField(term41991, term41991.getClass(), "propertyMapOutputFile", null);
        setField(term41991, term41991.getClass(), "codingConvention", null);
        setIntField(term41991, term41991.getClass(), "summaryDetailLevel", 0);
        setField(term41991, term41991.getClass(), "outputWrapper", null);
        setField(term41991, term41991.getClass(), "outputWrapperMarker", null);
        setField(term41991, term41991.getClass(), "moduleWrapper", null);
        setField(term41991, term41991.getClass(), "moduleOutputPathPrefix", null);
        setField(term41991, term41991.getClass(), "createSourceMap", null);
        setField(term41991, term41991.getClass(), "sourceMapDetailLevel", null);
        setField(term41991, term41991.getClass(), "sourceMapFormat", null);
        setField(term41991, term41991.getClass(), "jscompError", null);
        setField(term41991, term41991.getClass(), "jscompWarning", null);
        setField(term41991, term41991.getClass(), "jscompOff", null);
        setField(term41991, term41991.getClass(), "define", null);
        setField(term41991, term41991.getClass(), "tweak", null);
        setField(term41991, term41991.getClass(), "tweakProcessing", null);
        setField(term41991, term41991.getClass(), "charset", null);
        setBooleanField(term41991, term41991.getClass(), "manageClosureDependencies", false);
        setField(term41991, term41991.getClass(), "closureEntryPoints", null);
        setField(term41991, term41991.getClass(), "outputManifest", null);
        setField(term41989, term41989.getClass(), "config", term41991);
        setField(term41989, term41989.getClass(), "out", null);
        setField(term41989, term41989.getClass(), "err", null);
        setField(term41989, term41989.getClass(), "compiler", null);
        setField(term41989, term41989.getClass(), "inputCharset", null);
        setField(term41989, term41989.getClass(), "outputCharset", null);
        setBooleanField(term41989, term41989.getClass(), "testMode", false);
        setField(term41989, term41989.getClass(), "externsSupplierForTesting", null);
        setField(term41989, term41989.getClass(), "inputsSupplierForTesting", null);
        setField(term41989, term41989.getClass(), "modulesSupplierForTesting", null);
        setField(term41989, term41989.getClass(), "exitCodeReceiverForTesting", null);
        setField(term41989, term41989.getClass(), "runTimeStats", null);
        term41947 = newInstance(Class.forName("com.google.common.collect.SingletonImmutableList"));
        Object term41948 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term41949 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term41949, term41949.getClass(), "fileName", "/dev/null");
        setField(term41949, term41949.getClass(), "originalPath", "/dev/null");
        setIntField(term41949, term41949.getClass(), "lastOffset", 0);
        setIntField(term41949, term41949.getClass(), "lastLine", 1);
        setField(term41949, term41949.getClass(), "code", "");
        setField(term41948, term41948.getClass(), "referenced", term41949);
        setField(term41948, term41948.getClass(), "fileName", "/dev/null");
        setField(term41948, term41948.getClass(), "originalPath", null);
        setIntField(term41948, term41948.getClass(), "lastOffset", 0);
        setIntField(term41948, term41948.getClass(), "lastLine", 1);
        setField(term41948, term41948.getClass(), "code", null);
        setField(term41947, term41947.getClass(), "element", term41948);
        setField(term41947, term41947.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createExterns", argTypes, term41313, args);
        assertTrue(recursiveEquals(term41313, term41989));
        assertTrue(recursiveEquals(retValue, term41947));
    }

};


