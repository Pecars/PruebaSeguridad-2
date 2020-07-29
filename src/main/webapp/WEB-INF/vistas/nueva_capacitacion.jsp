<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


            <jsp:include page="plantillas/nav.jsp"></jsp:include>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Crear Capacitacion</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-md-6">
                        <form:form method="post" action="guardarcapacitacion">
                            <div class="form-group col-lg-8">
                                <label>Nombre capacitación</label>
                                <form:input path="nombre_capacitacion" class="form-control" type="text"/>
                            </div>
                            <div class="form-group col-lg-8">
                                <label>Fecha creacion</label>
                                <form:input path="fecha_creacion_capacitacion" class="form-control" type="date"/>
                            </div>
                            
                            <div class="form-group col-lg-8">
                                <label>Estado de vigencia</label>
                                <form:input path="vigencia_capacitacion" class="form-control" type="text"/>
                            </div>
                            
                            <div class="col-lg-8">
                                <button type="submit" class="btn btn-default btn-success btn-form">Submit Button</button>
                                <button type="reset" class="btn btn-default btn-danger btn-form">Reset Button</button>
                            </div>
                        </form:form>
                    </div>

                </div>
                <!-- /.row -->

            </div>

            <jsp:include page="plantillas/scripts.jsp"></jsp:include>